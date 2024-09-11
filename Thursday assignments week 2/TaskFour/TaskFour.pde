//4.a
for (int i = 0; i <= 20; i++){
  println(i);
}

//4.b
for (int i = 0; i <= 20; i++){
  if (i % 2 == 0){
    println(i);
  }
}

//4.c
int start = 8;
for (int i = start; i > 0; i--){
  println(i);
}
println("Take off!");

//4.d.b
int i = 0;
while (i <= 20){
  if (i % 2 == 0){
    println(i);
  }
  i++;
}

//4.d.c
int j = 8;
while (j > 0){
  println(j);
  j--;
}
println("Take off!");
