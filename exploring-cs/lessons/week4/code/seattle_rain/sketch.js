/*  Written by Susan Evans
    Last edited 02/05/2017
    Simulates the Seattle rain with slow appearing ellipses
*/

function setup() {
  createCanvas(500, 500); // sets the canvas to 500x500
  background(0);          // sets the background color to black
  frameRate(5);           // slows down the frame rate to 5 a second
  fill(0);                // sets the fill color of the ellipses to black
}

function draw() {
  // if the random value between 0 and 1 is less than 0.5
  if (random(1) < 0.5) {   
    // fill with a darker stroke
    stroke(180, 180, 255);
  } else {
    // otherwise fill with a lighter stroke
    stroke(200, 200, 255);
  }
  
  // repeats 10 times
  for (i = 0; i < 10; i++) {
    // save the random size (to draw a circle)
    ellipseSize = random(10, 20);
    // draw the circle at a random location
    ellipse(random(1, 499), random(1, 499), ellipseSize, ellipseSize);
  }
}