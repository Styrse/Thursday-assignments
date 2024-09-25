//6. a
int[][] board = new int[8][8];

//6. b
void setup(){
  for (int i = 0; i < board.length; i++){
    for (int j = 0; j < board[i].length; j++){
      if (j % 2 == 0){
        println("1");
      } else {
        println("0");
      }
    }
  }
}
