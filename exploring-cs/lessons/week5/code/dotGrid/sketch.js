function setup() {
  createCanvas(400, 400);
}

function draw() {
  for(y = 20; y < height - 20; y = y + 5){
    for(x = 20; x < width - 20; x = x + 5){
      point(x,y);  
    }
  }
}