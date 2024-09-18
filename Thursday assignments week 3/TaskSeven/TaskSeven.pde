void setup(){
  myFunction(10);
}

void myFunction(int number){
  println(number);
  number --;
  if (number < 0){
  } else {
    myFunction(number);
  }
}
