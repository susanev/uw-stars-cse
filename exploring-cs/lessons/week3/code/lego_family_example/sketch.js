// Originally created by Livia Brown
// Modified by susan evans
// Last Edited 1.29.17
// Created a Star Wars Droid lego family and
// moved them to the center of the screen from the corners 

var sassyX = 50;
var sassyY = 50;

var smartX = 50;
var smartY = 600;

var talkX = 700;
var talkY = 20;

var beepX = 700;
var beepY = 600;

var woofX = 50;
var woofY = 625;

function setup() { 
  createCanvas(800, 900); // creates canvas size
  background(83, 126, 116); // fills background with color
}

function draw() { //sets up draw function
  background(83, 126, 116); // clears background
  sassy(); 
  smart();
  talk();
  beep();
  woof();
  button();

  sassyX = min(sassyX + 1, 290);
  sassyY = min(sassyY + 1, 200);
  smartX = min(smartX + 1, 410);
  smartY = max(smartY - 1, 350);
  talkX = max(talkX - 1, 530);
  talkY = min(talkY + 1, 250);
  beepX = max(beepX - 1, 660);
  beepY = max(beepY - 1, 350);
}  

function resetVariables() {
  sassyX = 50;
  sassyY = 50;
  
  smartX = 50;
  smartY = 600;
  
  talkX = 700;
  talkY = 20;
  
  beepX = 700;
  beepY = 600;
  
  woofX = 50;
  woofY = 625;
}

// K2S0 droid top left to center 
function sassy() {
  noStroke();
  fill(43, 39, 39);
  rect(sassyX, sassyY, 50, 300);
  rect(sassyX - 8, sassyY - 30, 65, 60);
  fill(209, 208, 208);
  ellipse(sassyX + 7, sassyY, 15, 15);
  ellipse(sassyX + 42, sassyY, 15, 15);
  fill(83, 126, 116);
  rect(sassyX + 5, sassyY + 150, 40, 375);
}
  
// R2D2 bottom left to center
function smart() { 
  fill(255);
  rect(smartX, smartY, 60, 150);
  fill(235, 235, 236);
  rect(smartX, smartY, 60, 60);
  fill(0, 35, 109);
  rect(smartX, smartY + 65, 60, 5);
  rect(smartX, smartY + 50, 60, 10);
  rect(smartX + 20, smartY + 15, 20, 20);
  fill(255, 0, 0);
  ellipse(smartX + 30, smartY + 25, 13, 13);
}
  
// C3PO moves from top right to center
function talk() {
  fill(254, 216, 128);
  rect(talkX, talkY, 60, 250);
  rect(talkX, talkY + 120, 60, 20);
}
  
// BB8 move from bottom right to center
function beep() {
  fill(255);
  rect(beepX, beepY, 60, 150);
  fill(217, 212, 216);
  rect(beepX, beepY, 60, 10);
  fill(0);
  ellipse(beepX + 30, beepY + 25, 20, 20);
  ellipse(beepX + 45, beepY + 40, 10, 10);
  fill(231, 133, 24);
  rect(beepX, beepY + 50, 60, 15);
}
 
// AT-AT moves from bottom left of screen to center of the screen
function woof() {
  fill(216, 216, 208);
  rect(woofX, woofY, 125, 55);
  rect(woofX, woofY + 20, 12, 100);
  rect(woofX + 25, woofY + 20, 12, 100);
  rect(woofX + 90, woofY + 20, 12, 100);
  rect(woofX + 113, woofY + 20, 12, 100);
  rect(woofX - 50, woofY + 8, 40, 30);
  rect(woofX - 70, woofY + 35, 30, 2);
  rect(woofX - 15, woofY + 20, 20, 10);
  rect(woofX - 75, woofY + 33, 10, 5);
  woofX = min(woofX + 1, 110);
  woofY = max(woofY - 1, 380); 
}

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