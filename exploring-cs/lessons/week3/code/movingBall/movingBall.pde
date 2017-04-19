/*  susan evans
    last edited 04/12/2017
    class example, with a ball moving on the screen
*/

int ballX = 25;

void setup() {
  // sets the size of the canvas to 500x500
  size(500, 500);
  // turns the stroke off
  noStroke();
  // sets the background color to white
  background(255);
}

void draw() {
  // clears the background, so the ball does not leave a trail
  background(255);
  // sets the fill color to red
  fill(255, 0, 0);
  // draws the 50x50 ball at ballX, 100
  ellipse(ballX, 100, 50, 50);
  // increases the ballX variable by 1
  ballX = ballX + 1;
}