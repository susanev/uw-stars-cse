function setup() {
  createCanvas(500, 500);
  textSize(40);
  background(200);
}

function draw() {
  
}

function keyTyped() {
  background(200);
  text(key, 100, 100);
  
  if (key.toUpperCase() == "R") {
    background(255, 0, 0);
  } else if (key.toUpperCase() == "G") {
    background(0, 255, 0);
  } else if (key.toUpperCase() == "B") {
    background(0, 0, 255);
  }
}