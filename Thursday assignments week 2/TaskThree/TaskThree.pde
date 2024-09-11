//3.a
int a = (int) random(15);
int b = (int) random(15);

int sum = a + b;

if (sum == 10 || a == 10 || b == 10){
  println("Success!");
}
else{
  println("Failure!");
}

//3.b
int min = (int) random(10);
int max = (int) random(10);

int sum2 = min + max;

if (sum2 > 10 && (min <= 5 || max <= 5)){
  println("Success!");
}
else{
  println("Failure!");
}

//3.c
int x = (int) random(40);
int y = (int) random(40);
int z = (int) random(40);

int sum3 = x + y + z;

if (sum3 == 30 && x != 10 && x != 20 && x != 30 && y != 10 && y != 20 && y != 30 && z != 10 && z != 20 && z != 30){
  println("Success!");
}
else {
  println("Failure!");
}
