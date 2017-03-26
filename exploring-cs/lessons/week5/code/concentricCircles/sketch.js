function setup() {
  createCanvas(400, 400);
  noFill();
  
  for(d = 10; d < width; d = d + 10){
    ellipse(width / 2, height / 2, d, d);  
  }
}