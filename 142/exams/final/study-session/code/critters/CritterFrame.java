// Class CritterFrame provides the user interface for a simple simulation
// program.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class CritterFrame extends JFrame {
    private CritterModel myModel;
    private CritterPanel myPicture;
    private javax.swing.Timer myTimer;
    private JButton[] counts;
    private JButton countButton;
    private boolean started;
    private static boolean created;
    
    public CritterFrame(int width, int height) {
        // this prevents someone from trying to create their own copy of
        // the GUI components
        if (created)
            throw new RuntimeException("Only one world allowed");
        created = true;

        // create frame and model
        setTitle("CSE142 critter simulation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        myModel = new CritterModel(width, height);

        // set up critter picture panel
        myPicture = new CritterPanel(myModel);
        add(myPicture, BorderLayout.CENTER);

        addTimer();

        constructSouth();

        // initially it has not started
        started = false;
    }

    // construct the controls and label for the southern panel
    private void constructSouth() {
        // add timer controls to the south
        JPanel p = new JPanel();

        final JSlider slider = new JSlider();
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                double ratio = 1000.0 / (1 + Math.pow(slider.getValue(), 0.3));
                myTimer.setDelay((int) (ratio - 180));
            }
        });
        slider.setValue(20);
        p.add(new JLabel("slow"));
        p.add(slider);
        p.add(new JLabel("fast"));

        JButton b1 = new JButton("start");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myTimer.start();
            }
        });
        p.add(b1);
        JButton b2 = new JButton("stop");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myTimer.stop();
            }
        });
        p.add(b2);
        JButton b3 = new JButton("step");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doOneStep();
            }
        });
        p.add(b3);
        
        // add debug button
        JButton b4 = new JButton("debug");
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myModel.toggleDebug();
                myPicture.repaint();
            }
        });
        p.add(b4);

        // add 100 button
        JButton b5 = new JButton("next 100");
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multistep(100);
            }
        });
        p.add(b5);

        add(p, BorderLayout.SOUTH);
    }

    // starts the simulation...assumes all critters have already been added
    public void start() {
        // don't let anyone start a second time and remember if we have started
        if (started) {
            return;
        }
        // if they didn't add any critters, then nothing to do
        if (myModel.getCounts().isEmpty()) {
            System.out.println("nothing to simulate--no critters");
            return;
        }
        started = true;
        addClassCounts();
        myModel.updateColorString();
        pack();
        setVisible(true);
    }

    // add right-hand column showing how many of each critter are alive
    private void addClassCounts() {
        Set<Map.Entry<String, Integer>> entries = myModel.getCounts();
        JPanel p = new JPanel(new GridLayout(entries.size() + 1, 1));
        counts = new JButton[entries.size()];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = new JButton();
            p.add(counts[i]);
        }

        // add simulation count
        countButton = new JButton();
        countButton.setForeground(Color.BLUE);
        p.add(countButton);

        add(p, BorderLayout.EAST);
        setCounts();
    }

    private void setCounts() {
        Set<Map.Entry<String, Integer>> entries = myModel.getCounts();
        int i = 0;
        int max = 0;
        int maxI = 0;
        for (Map.Entry<String, Integer> entry: myModel.getCounts()) {
            String s = String.format("%s =%4d", entry.getKey(),
                                     (int) entry.getValue());
            counts[i].setText(s);
            counts[i].setForeground(Color.BLACK);
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxI = i;
            }
            i++;
        }
        counts[maxI].setForeground(Color.RED);
        String s = String.format("step =%5d", myModel.getSimulationCount());
        countButton.setText(s);
    }

    // add a certain number of critters of a particular class to the simulation
    public void add(int number, Class<? extends Critter> c) {
        // don't let anyone add critters after simulation starts
        if (started) {
            return;
        }
        // temporarily turning on started flag prevents critter constructors
        // from calling add
        started = true;
        myModel.add(number, c);
        started = false;
    }

    // post: creates a timer that calls the model's update
    //       method and repaints the display
    private void addTimer() {
        ActionListener updater = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doOneStep();
            }
        };
        myTimer = new javax.swing.Timer(0, updater);
        myTimer.setCoalesce(true);
    }

    // one step of the simulation
    private void doOneStep() {
        myModel.update();
        setCounts();
        myPicture.repaint();
    }

    // advance the simulation until step % n is 0
    private void multistep(int n) {
        myTimer.stop();
        do {
            myModel.update();
        } while (myModel.getSimulationCount() % n != 0);
        setCounts();
        myPicture.repaint();
    }
}
