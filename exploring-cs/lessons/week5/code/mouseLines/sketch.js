function setup() {
  createCanvas(400, 400);
  strokeWeight(4);
}

function draw() {
  background(204);
  
  for(i = 10; i < mouseY; i = i + 18){
    line(0, i, 390, i);  
  }
}