void setup() {
  int x = divisible(22);
  println(x);
}

int divisible(int number) {
  int sum = 0;
  for (int i = 1; i <= 100; i++) {
    if (i%number == 0) {
      println(i);
      sum++;
    }
  }
  return sum;
}
