/*  Written by Susan Evans
    Last edited 02/05/2017
    Simulates a beating heart
*/

var dir = -1;         // controls whether the heart is getting lighter or darker
var heartTint = 255;  // the hearts current tint

function setup() {
  createCanvas(500, 500); // sets the canvas size to 500x500
  background(64);         // sets the background to a shade of gray
  frameRate(15);          // slows the frame rate to 15 times a second
  noStroke();             // removes stroke from the heart shape
}

function draw() {
  // calls the heart function passing the current heartTint
  heart(heartTint);
  // if the current heart tint is less than 100
  if (heartTint < 100) {
    // set the heart to become lighter
    dir = 1;
  } else if (heartTint > 255) { // if the current heart tint is greater than 255
    // set the heart to become darker
    dir = -1;
  }
  
  // update the heartTint based on the value of dir, with a multiplier of 5
  heartTint = heartTint + dir * 5;
}

// Draws a heart, with the given heartTint
function heart(heartTint) {
  fill(heartTint, 0, 0);
  ellipse(200, 250, 100, 100);
  ellipse(300, 250, 100, 100);
  triangle(153, 270, 348, 270, 250, 400);
  rect(240, 250, 20, 20);
}