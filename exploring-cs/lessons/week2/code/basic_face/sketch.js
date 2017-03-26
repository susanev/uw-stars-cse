/*  Originally created by Alysse Galo
    Modified by Susan Evans
    Last edited 01/22/2017
*/

function setup(){
  noStroke();
  createCanvas(500, 500);
  background(255, 255, 255);
}

function draw(){
  // hair
  noStroke();
  strokeWeight(2);
  fill(0, 0, 0);
  ellipse(128, 235, 50, 80);
  
  fill(0, 0, 0);
  ellipse(373, 235, 50, 80);
  
  // ears
  noStroke();
  strokeWeight(2);
  fill(243, 205, 159);
  ellipse(135, 295, 50, 50);
  
  fill(243, 205, 159);
  ellipse(367, 295, 50, 50);
  
  // ear inside
  noStroke();
  strokeWeight(2);
  fill(234, 184, 125);
  ellipse(135, 295, 30, 30);
  
  fill(234, 184, 125);
  ellipse(367, 295, 30, 30);
  
  // head
  noStroke();
  strokeWeight(2);
  fill(243, 205, 159);
  ellipse(250, 250, 250, 250);
  
  // eyes
  stroke(0);
  strokeWeight(1);
  fill(255, 255, 255);
  ellipse(196, 224, 50, 30);
  
  noStroke();
  fill(0);
  ellipse(196, 224, 30, 30);
  
  fill(255, 255, 255);
  ellipse(205, 224, 10, 10);
  
  stroke(0);
  strokeWeight(1);
  ellipse(300, 224, 50, 30); 
  
  noStroke();
  fill(0, 0, 0);
  ellipse(300, 224, 30, 30);
 
  fill(255, 255, 255);
  ellipse(310, 224, 10, 10); 
 
  // nose
  stroke(0);
  strokeWeight(2);
  fill(255, 255, 255);
  line(248, 224, 248, 281);
  
  // nostrils
  strokeWeight(1);
  fill(242, 205, 153);
  ellipse(264, 281, 20, 10); 
  
  fill(242, 205, 153);
  ellipse(232, 281, 20, 10); 
  
  // mouth 
  noStroke();
  fill(242, 159, 159);
  ellipse(249, 325, 40, 10);
  
  fill(0);
  ellipse(249, 325, 30, 5);
  
  // bowtie
  fill(234, 28, 46);
  rect(230, 380, 40, 30, 10);
  triangle(190, 366, 250, 396, 190, 420);
  triangle(308, 368, 250, 396, 308, 420);

  // eyebrows 
  stroke(0);
  strokeWeight(2);
  fill(255, 255, 255);
  line(279, 180, 316, 180);
  
  fill(255, 255, 255);
  line(180, 180, 215, 180);
}