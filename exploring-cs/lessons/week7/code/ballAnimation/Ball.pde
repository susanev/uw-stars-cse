class Ball {
  float x;
  float y;
  float xDir;
  float yDir;
  color c;
  
  Ball(float x, float y, float xDir, float yDir, color c) {
    this.x = x;
    this.y = y;
    this.xDir = xDir;
    this.yDir = yDir;
    this.c = c;
  }
  
  void update(int ballMin, int ballMax) {
    if (x < ballMin || x > ballMax) {
      xDir = xDir * -1;
    }
    if (y < ballMin || y > ballMax) {
      yDir = yDir * -1;
    }
    x = x + xDir;
    y = y + yDir;
  }
}
