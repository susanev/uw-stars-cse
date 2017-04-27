/* Created by susan evans
   Last edited 04/26/2017
   Demonstrates two different ways to use fonts
*/

//void setup() {
//  size(500, 500);
//  PFont font = loadFont("Athelas-Bold-48.vlw");
//  textFont(font);
//  text("hello world", 10, 50);
//}

void setup() {
  size(500, 500);
  PFont font = createFont("Timmana-Regular.ttf", 48);
  textFont(font);
  text("hello world", 10, 50);
}