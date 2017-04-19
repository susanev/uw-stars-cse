/*  Originally created by Melody Hirsch
    Edited by susan evans
    Last edited 04/08/2017
    Program that draws a cute robot
*/

void setup() {
  size(450, 850);             // creates a vertical rectangle canvas
  background(209, 153, 185);  // sets the background color to pink
  rectMode(CENTER);           // sets rects to be drawn from the center
}

void draw() {
  // sets the background color to pink
  background(209, 153, 185);  

  // draws the body of the monster 
  noStroke();
  fill(183, 255, 229);
  rect(225, 375, 350, 150, 7);
  rect(225, 330, 25, 450, 7);
  
  // draws the head, including the ears and the eyes
  // draws the ears
  fill(183, 255, 229);
  rect(225, 150 + 25, 300, 75, 7);
  fill(209, 153, 185);
  rect(225, 150 + 25, 280, 55, 7);
  // draws the head
  fill(183, 255, 229);
  rect(225, 150, 250, 150, 7);
  ellipse(225, 150 - 25, 125, 125);
  stroke(183, 255, 229);
  strokeWeight(5);
  line(225 - 15, 150 - 75, 225 - 50, 150 - 130);
  line(225 + 15, 150 - 75, 225 + 50, 150 - 130);
  // draws the eyes
  noStroke();
  fill(183, 255, 229);
  // outside part of eyes
  fill(209,153,185);
  ellipse(225 + 40, 150 + 15, 55, 55);
  ellipse(225 - 45, 150 + 15, 55, 55);
  // middle part of eyes
  fill(225,225,225);
  ellipse(225 + 40, 150 + 15, 40, 40);
  ellipse(225 - 45, 150 + 15, 40, 40); 
  // inner part of eyes
  fill(209,153,185);
  ellipse(225 + 40, 150 + 15, 25, 25);
  ellipse(225 - 45, 150 + 15, 25, 25);  
  rect(225, 150 + 50, 40, 20, 7);
  
  // draws the wheels
  fill(183, 255, 229);
  stroke(209, 153, 185);
  strokeWeight(2);
  ellipse(225, 600, 125, 125);
  fill(225, 225, 225);
  strokeWeight(4);
  ellipse(225, 600, 100, 100);
  ellipse(225, 600, 75, 75);
}
