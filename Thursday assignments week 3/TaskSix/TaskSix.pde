void setup() {
  divisible(22);
}

void divisible(int number) {
  for (int i = 1; i <= 100; i++) {
    if (number%i == 0) {
      println(i);
    }
  }
}
