
package Android;

abstract class Player {
    String name;
    char mark;
    
    abstract void makeMove();
    boolean isValidMove(int row, int column)
     {
        // row = row-1;
        // column = column-1;
         if(row >=0 && row<=2 && column>=0 && column<=2){
             if(TicTacToe.board[row][column]==' ')
                 return true;
         }
         return false;
     }
  
}
