Ball[] balls;

void setup() {
  size(500, 500);
  balls = new Ball[5];
  for (int i = 0; i < balls.length; i++) {
    balls[i] = new Ball(random(25, 475), 
                        random(25, 475),
                        random(-5, 5),
                        random(-5, 5),
                        color(random(255), random(255), random(255)));  
  }
}

void draw() {
  background(255);
  for (int i = 0; i < balls.length; i++) {
    balls[i].update(25, 475);
    fill(balls[i].c);
    ellipse(balls[i].x, balls[i].y, 50, 50);
  }
}