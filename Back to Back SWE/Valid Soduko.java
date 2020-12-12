class Solution {
  public boolean validSudoku(int[][] board) {
    //Check in columns or in rows
    for(int i=0; i<board.length;i++){
      boolean[] array = new boolean[9];
      for(int j=0;j<board.length;j++){
        if(board[i][j]!=0){
          if(array[board[i][j]-1]==true){
            return false;
          }else{
            array[board[i][j]-1] = true;
          }
        }
      }
    }return true;
  }
}