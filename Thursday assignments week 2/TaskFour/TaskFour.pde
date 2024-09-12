void setup() {
  four_a();
  four_b();
  four_c();
  four_d_b();
  four_d_c();
}

void four_a() {
  //4.a
  for (int i = 0; i <= 20; i++) {
    println(i);
  }
}

void four_b() {
  //4.b
  for (int i = 0; i <= 20; i++) {
    if (i % 2 == 0) {
      println(i);
    }
  }
}

void four_c() {
  //4.c
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

void four_d_b() {
  //4.d.b
  int i = 0;
  while (i <= 20) {
    if (i % 2 == 0) {
      println(i);
    }
    i++;
  }
}

void four_d_c() {
  //4.d.c
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
