//4. c
class Square{
  
  int xPosition;
  int yPosition;
  
  //4. d
  Square(int xPosition, int yPosition){
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }
  
  //4. f
  void display(){
    rectMode(CENTER);
    rect(xPosition, yPosition, width/10, height/10);
  }
}
