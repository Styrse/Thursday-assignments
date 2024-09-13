void setup() {
  Student Styrbjørn = new Student("Styrbjørn", 32, false, 'H');
  Student Niki = new Student("Niki", 28, true, 'A');

  println(isClassmates(Styrbjørn.dataScienceTeam, Niki.dataScienceTeam) ? Styrbjørn.name + " and " + Niki.name + " is in the same team." : Styrbjørn.name + " and " + Niki.name + " is not in the same team.");
}

boolean isClassmates(char personOne, char personTwo) {
  return personOne == personTwo;
}
