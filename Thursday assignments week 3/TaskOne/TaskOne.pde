//1.a
void setup(){
  method();
  method_receive("Hello world!");
  info("Styrbjørn", 32);
}

//1.b
void method(){
  println("Hello from the method");
}

//1.c
void method_receive(String text){
  println(text);
}

//1.d
void info(String name, int age){
  println("My name is " + name + ", I am " + age + " years old");
}
