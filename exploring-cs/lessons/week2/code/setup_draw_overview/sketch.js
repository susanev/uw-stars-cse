
// happen at the very beginning
// it will happen exactly once
// before anything else happens
function setup() {
  createCanvas(300, 300);
  background(255, 0, 0);
  frameRate(10);
}

// infinite loop
// frameRate, 60
// frameCount
function draw() {
  console.log(frameCount)
}