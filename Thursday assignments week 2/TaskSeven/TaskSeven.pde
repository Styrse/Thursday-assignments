int input;

void setup() {
  input = -20;
  
  seven_a();
  seven_b();
}

void seven_a() {
  //7.a
  for (int i = 0; i < input; i++) {
    if (i == 6) {
      println("six");
    } else if (i == input/2) {
      println("HALF!");
    } else {
      println(i);
    }
  }
}

void seven_b() {
  //7.b
  if (input > 0) {
    for (int i = 0; i < input; i++) {
      if (i == 6) {
        println("Six");
      } else if (i == input/2) {
        println("HALF!");
      } else {
        println(i);
      }
    }
  } else if (input < 0) {
    for (int i = 0; i > input; i--) {
      if (i == -6) {
        println("six");
      } else if (i == input/2) {
        println("HALF!");
      } else {
        println(i);
      }
    }
  } else {
    println("Please enter a number smaller or greater than 0");
  }
}
