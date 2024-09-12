void setup(){
  int number = total(8,7);
  println(number);
  println(total(3, 2));
  
  String message = uppercase("Tess skal have kage med!");
  println(message);
  println(uppercase("Jesper skal også have kage med!"));
  
  boolean is_up = capital_letter("Jordbærkage");
  println(is_up);
  println(capital_letter("gulerodskage"));
}

//2.a




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
