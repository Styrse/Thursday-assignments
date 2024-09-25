import java.util.Arrays;

int[] numbers = {3, 12, -1, 5, 3};

int[] sortNumbers(int[] moreNumbers) {
  Arrays.sort(moreNumbers);
  return moreNumbers;
}

void setup(){
  println(numbers);
  println("");
  println(sortNumbers(numbers));
}
