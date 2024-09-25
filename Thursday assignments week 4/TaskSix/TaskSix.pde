int sideLength = 40;

//6. a
int[][] board = new int[8][8];

//6. b
void setup() {
  size(320, 320);
  for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[i].length; j++) {
      if ((i + j) % 2 == 0) {
        board[i][j] = 1;      //Don't need to do it for 0 as it by default got 0 assigned
      }
    }
  }
}

//6. c and 6. d
void draw() {
  for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[i].length; j++) {
      if (board[i][j] == 1) {
        fill(0);
      } else {
        fill(255);
      }
      rect(i*sideLength, j*sideLength, sideLength, sideLength);
    }
  }
}
