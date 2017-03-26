function setup() {
  createCanvas(500, 500);
  background(255, 0, 0);
}

function draw() {
  ellipse(mouseX, mouseY, 25, 25);
}

function mousePressed() {
  fill(random(255), random(255), random(255));
}