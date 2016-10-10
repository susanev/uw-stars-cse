# Lecutre Notes
## Week 3

### Key Words
* __scope__: the part of the program where a variable exists
 * A variable declared in a for loop exists only in that loop
 * A variable declared in a method exists only in that method
* __primitive types__: int, double, boolean, char
* __object types__: name of class (.e.g., String, DrawingPanel)

### Drawing Panel
_Not built into Java, something written specifically for this class. Will need to place [DrawingPanel.java](DrawingPanel.java) in the same folder as your code in order for it to work properly_
* In computer graphics, the upper-left hand corner is (0,0)
* In order to use Color, you will need to add `import java.awt.*;` to the top of your code
* Drawing Panel methods

 |: __Method Nmae__ | : __Description__|
 | --- | --- |
 | `g.drawLine(x1, y1, x2, y2);` | draws a line between the points (x1, y1) and (x2, y2) |
 | `g.drawOval(x, y, width, height);` | draws the outline of an oval that fits exactly into a box of size width x height with the top-left corner of the box at (x, y) |
 | `g.drawRect(x, y, width, height);` | draws the outline of a rectangle of size width x height with the top-left corner at (x, y) |
 | `g.drawString(text, x, y)` | draws text with a bottom-left corner of (x, y) |
 | `g.fillOval(x, y, width, height)` | draws a filled in oval that fits exactly into a box of size width x height with a top-left corner at (x, y) |
 | `g.fillRect(x, y, width, height)` | draws a filled in rectangle of size width x height with a top-left corner at (x, y) |
 | `g.setColor(Color); ` | sets Graphics to paint any following shapes in the given color |
 
* See basic program with the setup below.
 ```
 
 

