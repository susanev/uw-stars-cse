float ratio = 255.0 / 500.0;

void setup() {
  size(500, 500);
}

void draw() {
  // black to white horizontal gradient
  for (int i = 0; i < 500; i++) {
    stroke(i * ratio);
    line(0, i, 500, i);
  }
  
  // black to white vertical gradient
  //for (int i = 0; i < 500; i++) {
  //  stroke(i * ratio);
  //  line(i, 0, i, 500);
  //}
  
  //// white to black horizontal gradient
  //for (int i = 0; i < 500; i++) {
  //  stroke(255 - (i * ratio));
  //  line(0, i, 500, i);
  //}
  
  // blue to yellow gradient
  //for (int i = 0; i < 500; i++) {
  //  stroke(i * ratio, i * ratio, 150);
  //  line(0, i, 500, i);
  //}
}