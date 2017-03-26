function setup() {
  createCanvas(400, 400);
  noStroke();
}

function draw() {
  background(204);
  rect(100, 200, 180, 160);
  
  if (mouseX > 100 && mouseX < 280 && mouseY > 200 && mouseY < 360) {
    fill(0);
  } else {
    fill(255);
  }
}