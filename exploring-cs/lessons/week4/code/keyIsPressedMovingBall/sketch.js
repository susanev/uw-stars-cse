var x = 100;
var y = 75;

function setup() {
  createCanvas(500, 500);
  background(200);
}

function draw() {
  background(255);
  fill(0, 255, 0);
  ellipse(x, y, 150, 150);
  
  if (keyIsPressed) {
    if (keyCode == UP_ARROW) {
      y = max(75, y - 10);
    } else if (keyCode == DOWN_ARROW) {
      y = min(y + 10, 425);
    } else if (keyCode == RIGHT_ARROW) {
      x = min(x + 10, 425);
    } else if (keyCode == LEFT_ARROW) {
      x = max(75, x - 10);
    }
  }
}