// array to hold all the balls
var circles = [];
var numCircles = 50;

function setup() {
  // create my canvas
  createCanvas(500, 500);
  // set to noStroke, so the circles do no have outlines
  noStroke();
  
  // create numCircles circle objects
  // add them to teh circles array
  for (i = 0; i < numCircles; i++) {
    // define the current circles size
    var circleSize = random(10, 50);
    // add this new circle to the array
    append(circles, 
      { size: circleSize,
        x: random(circleSize / 2, width - circleSize / 2),
        y: random(circleSize / 2, height - circleSize / 2),
        xDir: random(-5, 5),
        yDir: random(-5, 5),
        circleColor: color(random(0, 255), random(0, 255), random(0, 255)),
      }
    );
  }
}

function draw() {
  // clear the background
  background(255);
  // loop through the circles array
  // draw all the circles
  for (i = 0; i < circles.length; i++) {
    fill(circles[i].circleColor);
    ellipse(circles[i].x, circles[i].y, circles[i].size, circles[i].size);
  
    // advance them forward
    circles[i].x += circles[i].xDir;
    circles[i].y += circles[i].yDir;
    
    changeDirIfOnEdge(i);
    removeCollisions(i);
  }
}

// if they are on an edge
// change direction, for both x and y
function changeDirIfOnEdge(i) {
  if (circles[i].x < circles[i].size / 2 || circles[i].x > width - circles[i].size / 2) {
    circles[i].xDir *= -1;
  }
  if (circles[i].y < circles[i].size / 2 || circles[i].y > height - circles[i].size / 2) {
    circles[i].yDir *= -1;
  }
}

// if they collide with another circle
// remove both circles from the circle array
function removeCollisions(i) {
  for (j = 0; j < circles.length; j++) {
    if (i != j) {
      if (Math.abs(circles[i].x - circles[j].x) < 25 &&
          Math.abs(circles[i].y - circles[j].y) < 25) {
        circles.splice(i, 1);
        circles.splice(j - 1, 1);
        j = circles.length;
      }
    }
  }
}

