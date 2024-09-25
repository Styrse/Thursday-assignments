//2. a
String printPartOfWord(String word, int startIndex, int endIndex) {
  if (startIndex < 0 || endIndex < 0 || startIndex > endIndex) {      //2. d
    return "Jesper tager kage med";
  } else {
    return word.substring(startIndex, endIndex);
  }
}

//2. b
void setup() {
  println(printPartOfWord("København", 0, 2));
  println(last4CharactersOfString("København", 4));
}

//2. c
String last4CharactersOfString(String word, int startIndex) {
  return word.substring(word.length()-startIndex);
}
