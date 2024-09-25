//6. a
int[][] board = new int[8][8];

//6. b
void setup() {
  for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[i].length; j++) {
      if (j % 2 == 0) {
        board[i][j] = 1;      //Don't need to do it for 0 as it by default got 0 assigned
        println(board[i][j]);
      }
    }
  }
}
