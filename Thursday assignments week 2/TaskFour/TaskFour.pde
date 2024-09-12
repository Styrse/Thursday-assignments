void setup() {
  four_a();
  four_b();
  four_c();
  four_d_b();
  four_d_c();
}

//4.a
void four_a() {
  for (int i = 0; i <= 20; i++) {
    println(i);
  }
}


//4.b
void four_b() {
  for (int i = 0; i <= 20; i++) {
    if (i % 2 == 0) {
      println(i);
    }
  }
}

//4.c
void four_c() {
  int start = 8;
  for (int i = start; i > 0; i--) {
    if (i > 3) {
      println(i);
    } else if (i == 3) {
      println("Three");
    } else if (i == 2) {
      println("Two");
    } else if (i == 1) {
      println("One");
    }
  }
  println("Take off!");
}


//4.d.b
void four_d_b() {
  int i = 0;
  while (i <= 20) {
    if (i % 2 == 0) {
      println(i);
    }
    i++;
  }
}

//4.d.c
void four_d_c() {
  int j = 8;
  while (j >= 0) {
    if (j == 3) {
      println("Three");
      j--;
    } else if (j == 2) {
      println("Two");
      j--;
    } else if (j == 1) {
      println("One");
      j--;
    } else if (j == 0) {
      println("Take off!");
      j--;
    } else {
      println(j);
      j--;
    }
  }
}
