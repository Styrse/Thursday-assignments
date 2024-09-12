void setup() {
  Teacher Tess = new Teacher("Tess", 35, true);
  println(Tess.name);
  
  Tess.changeName("Jesper");
  println(Tess.name);  //Hvor virker det ikke med Jesper.name?
}
