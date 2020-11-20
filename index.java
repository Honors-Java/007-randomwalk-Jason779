//Put all your variables up here outside the setup or draw functions
//What variables may you want?
//  x, y, number of steps to take, and current steps taken


//Variables
int n = 300;
int steps = 0;
int x = 200;
int y = 200;

 
 //SetUp
void setup() {
	size(500, 500);
  frameRate(10);
} 
 //Drawloop
void draw() {
	stroke(1);
  
  //Creates the Rectangle
  rect(x, y, 10, 10);
  
  //If statement that determines random number
  if (steps < 300){
    int move = (int)(Math.random() * 4);
   
   //This is supposed to make the lead block look blue
    fill(255,255,255);
   //These are the steps per random number.
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
  if(steps < 300){
  fill(0,0,255);
  rect(x, y, 10, 10);
  }
  }
  
  
 //Makes the blocks come of the other side of the screen.
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



	



