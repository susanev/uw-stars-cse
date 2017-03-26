_HCDE 598 Winter 2017_
# Week 1 Exercise

## Building a Robot
### Goal 
This exercise is designed to explain the difference between a static program and a dynamic program and to practice using the Processing language by coloring a robot. 
### Part 1: Color The Robot
<img align="right" src="https://github.com/susanev/2016_Winter_UWHCDE_p5/blob/master/lessons/week1/exercises/images/robot.png" alt="Black, white, and gray robot">
* Program the code given below in your own p5.js sketch. Run it after every few lines to make sure you did not mistype and create an error. 
* Make the robot more interesting by coloring it with a theme (e.g., sports team, favorite food, or cartoon character).
* Most parts of the robot should be colored with something other than black, white, or gray. Your coloring theme should be unique, please do not copy another person's work, show us your own creativity and style!
* Add a comment to every line of your code clearly describing what it does

#### The Code
__Note__: It is an image, as we would like you to practice typing out the code.

![alt text][static]

#### Need help?
These steps will help you color your robot
* Find the robot part you want to color in the code
* Find a color using the color selector [Tools > Color Selector]
* Transfer the three RGB color numbers to the `fill()` function, or the `stroke()` function __before__ the line of code that draws the robot's part
* Run the program to make sure it still works and looks the way you want it to
* Add in a comment that describes the line of code you wrote or changed

### Part 2: Make The Robot Program Dynamic
The program you have written so far is static. The code runs, draws your beautiful robot, and then quits. 

We want it to be active (keep running) and make our robot move. Notice the program shown below, this is a dynamic version. The new code groups the instructions for the robot into two functions, the `setup()` function and the `draw()` function. Tip: In programming, functions are written with a pair of parentheses after the name. You should make the highlighted changes to your code. 

![alt text][dynamic]

#### What is happening?
The `setup()` function runs once, when the program is first run. After the `setup()` runs, then the `draw()` function runs over and over again. This redraws the image. The diagram shows what is happening when the Processing engine runs a dynamic program.

![alt text][diagram]

The way to read this diagram is first setup is called and finishes, then draw is run and finishes, and then draw is called and runs again and finishes again, again and again …. Until you stop the program or turn off your computer”

### Part 3: Move the Robot
Add two more instructions to your dynamic program at the top of your draw function.

The instructions go inside of `draw()` – right after the `draw()` function and before the `// Neck comment`. __Caution__: Notice that “mouse” is written in lowercase letters, and the X and Y are uppercase; this is required. After adding the code run your program and move your mouse.

![alt text][part 3 code]

### Part 4: Lots of Robots!
Remove `background(205);` from your program, and run it again. Add a block comment at the top of your program that clearly explains what is happening when you remove the background line of code and what happens when you put it back in. Need help understanding this? Reach out to us!

### Submission
Make sure your code has the background call added back in before submitting and add this project to your github portfolio.

### Extra Challenge
If you want to challenge yourself with this project try out any of the items below
* It seems like the robot is off from where the mouse is, figure out why and fix it
* Give your robot some extra features, or even a side-kick!

### Reference
This assignment is inspired by the robot code provided by [Casey Reas](http://reas.com/) and [Ben Fry](http://benfry.com/) in the Make:Getting Started with Processing book.

[static]: https://github.com/susanev/uw-hcde-creative-computing/blob/master/lessons/week1/exercises/images/code_not_dynamic.png "Code that is not dynamic"

[dynamic]: https://github.com/susanev/uw-hcde-creative-computing/blob/master/lessons/week1/exercises/images/code_dynamic.png "Code that is dynamic"

[diagram]: https://github.com/susanev/uw-hcde-creative-computing/blob/master/lessons/week1/exercises/images/diagram.png "diagram showing how setup and draw flow"

[part 3 code]: https://github.com/susanev/uw-hcde-creative-computing/blob/master/lessons/week1/exercises/images/part3_code.png "Additional lines of code to add"


