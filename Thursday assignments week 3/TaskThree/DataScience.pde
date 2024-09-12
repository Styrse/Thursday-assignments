void setup() {
  Teacher Tess = new Teacher("Tess", 35, true);
  Student Styrbjørn = new Student("Styrbjørn", 32, false, 'H');
  Student Niki = new Student("Niki", 28, true, 'A');
  
  println(Tess.name);
  println("Name: " + Styrbjørn.name + "\nGroup: " + Styrbjørn.dataScienceTeam);
  println("Name: " + Niki.name + "\nGroup: " + Niki.dataScienceTeam);
}
