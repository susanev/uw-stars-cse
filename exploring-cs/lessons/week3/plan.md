_HCDE 598 Winter 2017_

# Plan
## Week 3

### Introduction (5 minutes)
* Re-introduce myself and the class
* Round of names from the class
* Office hours 2 – 5 instead?
* Review today's learning objectives
* Meet your partner

### Warmup (30 minutes)
* Share your Lego Family with your partner, talk about process and what you are struggling with
* Share a few class examples
	* [Danielle](https://dteska.github.io/hcde-portfolio/lego_family/)
	* [Kelly](https://kellyjeangraham.github.io/portfolio/lego-bojack-family/)
	* [Nichole](https://nicholekim.github.io/portfolio/LegoFamily/)
	* [Tess](https://tws123.github.io/portfolio598Class/DynamicLegoFamily/)
	* [Zack](https://zjrobinson90.github.io/portfolio/rickmorty/)
* Review Lego Family
* Suggestions for improvements
* Fix/clean your code; help each other!

## Lessons (25 minutes)
* Conditional statement structure
* Logical operators (and, or)
* Events
* Variables: mouseX, mouseY, mouseIsPressed, frameCount
* Functions: random, dist, mousePressed, mouseReleased

### Break (7pm—10 minutes)

### Exercises (50 minutes)
* Rotating square

	```javascript
	// inspired by http://genekogan.com/

	function setup() {
		createCanvas(350, 350);
		// draw rect from CENTER
		// rectMode(CENTER);
	}

	function draw() {
		background(240);

		// move the origin to the pivot point
		translate(150, 150); 

		// then rotate the grid around the pivot point by a
		// number of degrees equal to the frame count of the sketch
		rotate(radians(frameCount));

		// and draw the square at the origin
		fill(0);
		rect(0, 0, 100, 100);
	}
	```

* Rotating rect

	```javascript
	function setup() {
		createCanvas(400, 400);
		background(240);
		rectMode(CENTER);
	}

	function draw() {
		//if (frameCount % 25 == 0) {
			//fill(random(255), random(255), random(255));
			//fill(0);
			translate(200, 200);
			rotate(radians(frameCount));
			rect(0, 0, 300, 20);
		//}
	}
	```

* Drawing with ellipses

	```javascript
	function setup() {
	  createCanvas(500, 500);
	  background(255, 0, 0);
	}

	function draw() {
	  ellipse(mouseX, mouseY, 25, 25);
	}

	function mousePressed() {
	  fill(random(255), random(255), random(255));
	}
	```

* Drawing with lines

	```javascript
	function setup() {
	  createCanvas(500, 500);
	  background(0, 0, 255);
	}

	function draw() {
	  if(mouseIsPressed) {
	    stroke(255, 255, 255);
	    line(150, 150, mouseX, mouseY);
	  }
	}
	```

* Rect hover

	```javascript
	function setup() {
	  createCanvas(400, 400);
	  noStroke();
	}

	function draw() {
	  background(204);
	  rect(100, 200, 180, 160);
	  
	  if (mouseX > 100 && mouseX < 280 && mouseY > 200 && mouseY < 360) {
	    fill(0);
	  } else {
	    fill(255);
	  }
	}
	```

* Growing circle

	```javascript
	var x = 250;
	var y = 250;
	var w = 50;

	function setup() {
	  createCanvas(500, 500);
	  background(255);
	  noStroke();
	}

	function draw() {
	  background(255);
	  fill(120);
	  ellipse(x, y, w, w);
	  distance = dist(x, y, mouseX, mouseY);
	  if (distance < w / 2) {
	    w = w + 1; 
	  } else {
	    w = 50;  
	  }
	}
	```

* Add restart button to Lego Family

	```javascript
	function button() {
	  if (mouseX > 300 && mouseX < 500 && mouseY > 775 && mouseY < 825  && mouseIsPressed) {
	    fill(0, 200, 0);
	  } else {
	    fill(0, 255, 0);
	  }
	  rect(300, 775, 200, 50, 10);
	  fill(0);
	  textSize(40);
	  text("Reset", 350, 815);
	}

	function mouseReleased() {
	  if (mouseX > 300 && mouseX < 500 && mouseY > 775 && mouseY < 825) {
	    resetVariables();
	  }
	}
	```

### Break (8pm—5 minutes)

### Introduce Homework (10 minutes)

### Start Homework (20 minutes)

### Debrief (10 minutes)