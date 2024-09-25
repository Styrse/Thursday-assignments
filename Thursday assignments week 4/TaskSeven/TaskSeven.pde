//7. a
ArrayList<Integer> numberList = new ArrayList<Integer>();
ArrayList<String> stringList = new ArrayList<String>();
ArrayList<Boolean> booleanList = new ArrayList<Boolean>();

void fillArrayLists() {
  int[] numbers = {10, 20, 30};
  String[] strings = {"Strawberry cake", "Carrot cake", "Gelato"};
  boolean[] booleans = {true, true, false};

  for (int i = 0; i < numbers.length; i++) {
    numberList.add(numbers[i]);
  }

  for (int i = 0; i < strings.length; i++) {
    stringList.add(strings[i]);
  }

  for (int i = 0; i < booleans.length; i++) {
    booleanList.add(booleans[i]);
  }
}

void setup() {
  fillArrayLists();
  printString(stringList);
}


//7. b
void printString(ArrayList<String> betterString) {
  for (String s : betterString) {
    println(s);
  }
}
