var boardSize = 2;
var tiles = [];
var emptyX = 0;
var emptyY = 0;
var won = false;

function setup() {
  createCanvas(400, 400);
  background(0, 100, 100);
  textFont("Helvetica");
  textSize(25);
  // add tiles to tiles array
  // fill in the code here
  // resets board
  // reset();
}

function draw() {
  background(0, 100, 100);
  // draw reset button
  // fill color depends on hover state
  if (overResetButton()) {
    fill(0, 50, 50);
  } else {
    fill(0, 100, 100);
  }
  rect(163, 343, 78, 33);
  // draw reset text
  fill(255);
  text("Reset", 169, 368);
  
  // draw game board
  // gameBoard();
  // if winnder, display message
  if (won) {
    text("You won!", 100, 75);
  }
}

function gameBoard() {
  // draw the boards background
  fill(10, 116, 180);
  rect(100, 100, 50 * boardSize, 50 * boardSize);
  
  // draws all the tiles in place
  for (i = 0; i < boardSize; i++) {
    for (j = 0; j < boardSize; j++) {
      if (tiles[convert(i, j)] != 0) {
        fill(0, 200, 200);
        rect(102 + j * 50, 102 + i * 50, 46, 46);
        fill(0);
        text(tiles[convert(i,j)], 102 + j * 50 + 10, 102 + i * 50 + 30);
      }
    }
  }
}

// converts the row, col to the tile in that position
function convert(row, col){
  return row * boardSize + col;
}

function reset() {
  tiles = shuffle(tiles);
  var index = 0;
  while (tiles[index] != 0) {
    index++;
  }
  tiles[index] = tiles[0];
  tiles[0] = 0;
  emptyX = 0;
  emptyY = 0;
  won = false;
}

function mousePressed() {
  if (overResetButton()) {
    // reset();
  }
}

function overResetButton() {
  return mouseX > 163 && mouseX < 163+78 &&
      mouseY > 343 && mouseY < 343+33;
}

function mouseReleased() {
  // converts mouseX and Y to a row and col
  row = (int)((mouseY - 100) / 50);
  col = (int)((mouseX - 100) / 50);
  
  // if the tiles are next to each other (1 away)
  // then switch those two tiles
  if((abs(row - emptyX) + abs(col - emptyY)) == 1){
    temp = tiles[convert(emptyX, emptyY)];
    tiles[convert(emptyX, emptyY)] = tiles[convert(row, col)];
    tiles[convert(row, col)] = temp;
    
    emptyX = row;
    emptyY = col;
  }
  
  // update won variable if the user has wonn
  // won = checkWinner();
}

// returns true if the tiles are in order
// false otherwise
function checkWinner() {
  // fill in code here
}