/*  Written by Susan Evans
    Last edited 02/06/2017
    Animaties a walking person
*/

var leg = 0;        // keeps track of which leg to move
var x = 0;          // the current x position of the person
var leftStep = 0;   // current left step of person
var rightStep = 0;  // current right step of person

function setup() {
  createCanvas(500, 500); // sets the canvas to 500x500
  frameRate(30);          // slows the frame rate down to 30 a second
  strokeWeight(3);        // sets the strokeWeight to 3
  noFill();               // sets the persons head to not fill
}

function draw() {
  background(0);              // clears the background
  level();                    // draws the yellow level
  
  // if leg is currently zero
  if (leg == 0) {
    // move the left leg
    leftStep = leftStep + 2;
  } else {
    // othewise move the right leg
    rightStep = rightStep + 2;
  }
  
  // if the legs are 15 pixels appart
  if (abs(leftStep - rightStep) >= 15) {
    // switch the moving leg
    leg = 1 - leg;
  }
  
  // draw the person at the current x position
  person(x);
  // advance the x position forward by 1
  x = x + 1;
}

// Draws the yellow level
function level() {
  stroke(255, 255, 0);
  line(50, 170, 302, 170);
  line(302, 170, 300, 300);
  line(333, 170, 500, 170);
  line(333, 170, 333, 300);
}

// draws the red person
function person() {
  stroke(255, 0, 0);
  // head
  ellipse(100 + x, 100, 20, 20);
  // body
  line(100 + x, 110, 100 + x, 140);
  line(100 + x, 125, 80 + x, 110);
  line(100 + x, 125, 120 + x, 110); 
  // legs
  line(100 + x, 140, 90 + leftStep, 170);
  line(100 + x, 140, 110 + rightStep, 170);
}
