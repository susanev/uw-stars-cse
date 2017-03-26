// 400 × 320
var cat;
var catWidth = 400;
var aspectRatio = 320 / 400;

function preload() {
  cat = loadImage("kitty.png");
}

function setup() {
  createCanvas(800, 800);
}

function draw() {
  // background(255);
  // image(cat, 0, 0, mouseX, mouseX * aspectRatio);
}

function mousePressed() {
  background(255);
  catWidth = random(10, 600);
  image(cat, random(0, 700), random(0, 700), catWidth, catWidth * aspectRatio);
}