void setup(){
  int number = total(8,7);
  println(number);
  println(total(3, 2));
  
  String message = uppercase("Tess should bring cake!");
  println(message);
  println(uppercase("Jesper should also bring cake!"));
  
  boolean is_up = capital_letter("Strawberry cake");
  println(is_up);
  println(capital_letter("Carrot cake"));
}

//2.b
int total(int x, int y){
  return(x+y);
}

//2.c
String uppercase(String word){
  return word.toUpperCase();
}

//2.d
boolean  capital_letter(String first_letter){
  return Character.isUpperCase(first_letter.charAt(0));
}
