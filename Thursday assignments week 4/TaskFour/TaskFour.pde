//4. b
Square[] squareHolder = new Square[10];

//4. h
Square[] squares = new Square[10]; 

//4. a
void setup(){
  size(600, 600);
  
  //4. e
  Square testSquare = new Square(100, 200);
  //4. g
  testSquare.display();
  
  //4. i and 4. j
  for (int i = 0; i < 10; i++){
    squares[i] = new Square((int) random(width), (int) random(height));
    squares[i].display();
  }
}
