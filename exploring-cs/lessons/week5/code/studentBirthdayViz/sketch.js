/*  Created by susan evans
    Last edited 02/13/2017
    This program displays a visualizations of the most popular
    birthdays of the year.
    
    INCOMPLETE VERSION
*/

// ranks by day of the year (out of 365)
// Data from 2016 (leap year); source unknown
var rank = [364,362,356,350,338,301,324,347,351,349,341,306,316,260,304,322,337,317,302,240,279,271,294,333,
        299,298,262,280,285,314,343,330,253,256,281,287,293,332,308,245,171,214,166,331,103,248,244,232,
        237,246,206,292,218,213,157,204,203,247,250,366,235,189,133,150,156,228,290,265,268,195,163,165,
        334,300,264,208,134,152,198,202,254,261,255,210,162,187,225,297,275,267,227,348,193,278,277,336,
        286,226,196,274,296,335,315,346,257,223,243,309,323,339,310,259,201,230,307,325,327,313,270,282,
        288,242,305,329,291,177,181,229,276,326,273,251,175,249,174,183,272,258,188,168,123,138,141,176,
        167,311,289,211,200,234,328,319,153,121,124,146,179,197,215,191,154,120,137,170,303,169,139,117,
        107,126,140,132,145,118,110,95,100,112,129,108,101,75,50,47,127,361,321,76,14,12,37,49,90,93,99,43,
        25,40,61,91,87,51,45,18,32,72,78,80,58,35,28,39,68,86,85,66,48,36,46,60,64,77,52,56,17,67,55,71,70,54,
        33,30,31,57,82,81,63,59,38,34,44,74,73,65,106,114,92,98,125,111,105,29,2,9,24,41,69,16,8,1,4,10,13,15,
        7,5,3,6,11,27,21,23,22,19,20,53,88,89,79,83,84,97,119,122,160,136,180,116,109,155,216,239,219,159,135,
        164,212,269,209,184,172,142,173,252,355,233,222,178,131,143,207,236,241,192,182,158,194,312,263,238,
        190,161,148,147,151,199,340,344,352,353,357,358,359,345,231,149,144,186,283,320,318,284,221,217,205,
        295,266,342,185,128,102,94,96,113,104,115,224,354,363,365,360,130,62,42,26,220];

var numColors = 160;
var rectWidth = 40;
var rectHeight = 20;
var gridOffset = 50;

function setup(){

}

function draw(){

}

// Draws the day, and month labels
// and the labels for the gradient key
// as well as the gradient key itself
function drawLabels() {

}

// draws the grid of rectangles
function drawGrid() {

}

// given the current index (out of 365)
// returns the month (1 based)
function getMonth(index) {
  count = 0;
  currentMonth = 1;
  while (count + getDaysInMonth(currentMonth - 1) <= index) {
    count = count + getDaysInMonth(currentMonth - 1);
    currentMonth++;
  }
  return currentMonth;
}

// given the current index (out of 365)
// returns the day (1 based)
function getDay(index) {
  monthIndex = 0;
  currentDay = 1;
  count = 0;
  while (count < index) {
    if (currentDay == getDaysInMonth(monthIndex)) {
      monthIndex++;
      currentDay = 1;
    } else {
      currentDay++;
    }
    count++;
  }
  return currentDay;
}

// when the user hovers over a square
// it displays the actual rank of that day
function displayValues(){

}

// Given the current month (1-based)
// returns the total number of days
function getNumDays(monthIndex) {

}
// 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
// takes in a month, zero based
// and returns the days in that month
// 0 is January, 11 is December
function getDaysInMonth(month) {

}
