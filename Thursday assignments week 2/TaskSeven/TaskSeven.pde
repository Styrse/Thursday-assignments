//7.a
int input = 19;

for (int i = 0; i < input; i++) {
  if (i == 6) {
    println("six");
  } else if (i == input/2) {
    println("HALF!");
  } else {
    println(i);
  }
}

//7.b
int input2 = 19;


if (input2 > 0) {
  for (int i = 0; i < input2; i++) {
    if (i == 6) {
      println("Six");
    } else if (i == input2/2) {
      println("HALF!");
    } else {
      println(i);
    }
  }
} else if (input2 < 0) {
  for (int i = 0; i > input2; i--) {
    if (i == -6) {
      println("six");
    } else if (i == input2/2) {
      println("HALF!");
    } else {
      println(i);
    }
  }
} else{
  println("Please enter a number smaller or greater than 0");
}
