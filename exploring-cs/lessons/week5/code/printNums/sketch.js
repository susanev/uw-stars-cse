function setup() {
  createCanvas(500, 500);
  var nums = [1, 2, 3];
  append(nums, 7);
  nums[2] = 0;
  for (i = 0; i < nums.length; i++) {
    text(nums[i], 100, 25 + 50 * i);
  }
}

function draw() {
  
}