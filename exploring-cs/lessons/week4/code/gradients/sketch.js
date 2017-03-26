function setup() {
  createCanvas(500, 500);
}

function draw() {
  for (i = 0; i < 500; i++) {
    stroke(i * 0.5, i * 0.5, 150);
    line(0, i, 500, i);
  }
  
  // for (i = 0; i < 500; i++) {
  //   stroke(i * 0.5);
  //   line(i, 0, i, 500);
  // }
}