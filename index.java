//Put all your variables up here outside the setup or draw functions
//What variables may you want?
//  x, y, number of steps to take, and current steps taken

int n = 300;
int steps = 0;
int x = 200;
int y = 200;

 
void setup() {
	size(500, 500);
  frameRate(500);
}
 
void draw() {
	stroke(1);
  //starts random walking from 200,200
  rect(x, y, 10, 10);
  
  if (steps < 1000){
   int move = (int)(Math.random() * 4);
    fill(0,0,255);

   if(move == 0){
    fill(255,255,255);
    rect(x, y, 10, 10);
    steps = steps + 1;
    y = y - 10;
  }else if(move == 1){
    fill(255,255,255);
    rect(x, y, 10, 10);
    steps = steps + 1;
    y = y + 10;
  }else if(move == 2){
    fill(255,255,255);
    rect(x, y, 10, 10);
    steps = steps + 1;
    x = x - 10;
  }else if(move == 3){
    fill(255,255,255);
    rect(x, y, 10, 10);
    steps = steps + 1;
    x = x + 10;
  } 
  }
 
  if(y > 500){
    y = 0
  }
  if(y < 0){
    y = 500
  }
  if(x > 500){
    x = 0
  }
  if(x < 0){
    x = 500
  }
  //Here is where you should create the new rectangles to create the illusion of 'random walking'
  // You will need to make sure you dont draw more rectangles than the limit of steps
  //You'll need to use the Math.random() to decide how to create randomness in your drawing of rectangles.
  // Keep your canvas and rectangle width and height as I've given you
 
 
  
    println("drew rect at: " + x + ", " + y);
    println("Steps taken: " + steps);
}



	



