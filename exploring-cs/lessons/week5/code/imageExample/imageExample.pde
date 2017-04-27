/* Created by susan evans
   Last edited 04/26/2017
   Image example, using consistent aspect ratio
*/

PImage kitty;
float imgWidth = 400;
float aspectRatio = 400 / 400;

void setup() {
  size(500, 500);
  kitty = loadImage("kitty.jpg");
}

void draw() {

}

void mousePressed() {
  imgWidth = random(0, 500);
  image(kitty, random(0, 500 - imgWidth), random(0, 500 - imgWidth * aspectRatio),
      imgWidth, imgWidth * aspectRatio);
}