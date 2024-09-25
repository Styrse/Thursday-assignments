//3. a
String[] rapperNames = {"Eminem", "Snoop Dog", "Dr. Dre", "Biggie", "KRS-One"};
//3. c
String[] hit = {"Loose Yourself", "Drop It Like It's Hot", "Still D.R.E.", "Hypnotize", "Sound of da Police"};

//3. b
for (int i = 0; i < rapperNames.length; i++){
  println(i+1 + ". " + rapperNames[i]);
}


println("");
//3. d
for (int i = 0; i < rapperNames.length; i++){
  println(i+1 + ". " + rapperNames[i] + " : " + hit[i]);
}
