# Lecutre Notes
## Week 3

### Key Words
* __scope__: the part of the program where a variable exists
 * A variable declared in a for loop exists only in that loop
 * A variable declared in a method exists only in that method
* __primitive types__: int, double, boolean, char
* __object types__: name of class (.e.g., String, DrawingPanel)

### Drawing Panel
_Not built into Java, something written specifically for this class. Will need to place [DrawingPanel.java](DrawingPanel.java) in the same folder as your code and compile it in order for it to work properly_
* In computer graphics, the upper-left hand corner is (0,0)
* In order to use Color, you will need to add `import java.awt.*;` to the top of your code
* Methods to consider using

 | __Method Name__                                      |  __Description__|
 | :--------------------------------------------------- | :--- |
 | `dp.setBackground(Color);` | sets the background color of the panel |
 | `dp.clear();` | clears the background of the panel |
 | `dp.pause(miliseconds);` | pause the program for the number of miliseconds passed |
 | `g.drawLine(x1, y1, x2, y2);` | draws a line between the points (x1, y1) and (x2, y2) |
 | `g.drawOval(x, y, width, height);` | draws the outline of an oval that fits exactly into a box of size width x height with the top-left corner of the box at (x, y) |
 | `g.drawRect(x, y, width, height);` | draws the outline of a rectangle of size width x height with the top-left corner at (x, y) |
 | `g.drawString(text, x, y)` | draws text with a bottom-left corner of (x, y) |
 | `g.fillOval(x, y, width, height)` | draws a filled in oval that fits exactly into a box of size width x height with a top-left corner at (x, y) |
 | `g.fillRect(x, y, width, height)` | draws a filled in rectangle of size width x height with a top-left corner at (x, y) |
 | `g.setColor(Color); ` | sets Graphics to paint any following shapes in the given color |
 
* Basic program setup
 ```
  // needed in order to use Color
 import java.awt.*;

 public class BasicDrawing {
    public static void main(String [] args) {
       // creates a new Drawing Panel object of width 400, height 200
       DrawingPanel dp = new DrawingPanel(400, 200);

       // sets the background color of the panel
       dp.setBackground(Color.GREEN);

       // creates a new Graphics object
       Graphics g = dp.getGraphics();

       g.setColor(Color.RED);
       g.fillRect(100, 100, 50, 70);
       g.setColor(Color.BLUE);
       g.drawRect(100, 100, 50, 70);
    }
 }
 ```
 
 

