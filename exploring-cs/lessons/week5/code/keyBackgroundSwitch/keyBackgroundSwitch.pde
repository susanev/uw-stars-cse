void setup() {
  size(500, 500);
  textSize(40);
  background(200);
}

void draw() {
  
}

void keyTyped() {
  background(200);
  text(key, 100, 100);
  
  if (Character.toUpperCase(key) == 'R') {
    background(255, 0, 0);
  } else if (Character.toUpperCase(key) == 'G') {
    background(0, 255, 0);
  } else if (Character.toUpperCase(key) == 'B') {
    background(0, 0, 255);
  }
}