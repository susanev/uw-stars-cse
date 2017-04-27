/* Created by susan evans
   Last edited 04/26/2017
   Ball moves on screen with arrow keys
*/

// starting position of the ball
int x = 100;
int y = 75;

void setup() {
  size(500, 500);   // sets the canvas size
  background(200);  // sets the background color to gray
}

void draw() {
  // clears the background
  background(200);
  // sets the fill to green
  fill(0, 255, 0);
  // draws the 150x150 circle at position x,y
  ellipse(x, y, 150, 150);
  
  // if a key is currently pressed
  if (keyPressed) {
    // if that key is the up, down, left or right arrow
    // move the ball
    // but don't let it go off screen
    if (keyCode == UP) {
      y = max(75, y - 10);
    } else if (keyCode == DOWN) {
      y = min(y + 10, 425);
    } else if (keyCode == RIGHT) {
      x = min(x + 10, 425);
    } else if (keyCode == LEFT) {
      x = max(75, x - 10);
    }
  }
}