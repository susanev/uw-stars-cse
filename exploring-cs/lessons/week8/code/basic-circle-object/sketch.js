var circles = [];

function setup() {
	createCanvas(500, 500);
	noStroke();

	for (i = 0; i < 10; i++) {
		append(circles, 
			{ x: random(0, 500),
				y: random(0, 500),
				circleColor: color(random(0, 255))
			}
		);
	}

	for (i = 0; i < circles.length; i++) {
		console.log(red(circles[i].circleColor));
	}
}

function draw() {
	background(255);
	for (i = 0; i < circles.length; i++) {
		fill(circles[i].circleColor);
		ellipse(circles[i].x, circles[i].y, 50, 50);

		circles[i].x += 1;
	}
}


