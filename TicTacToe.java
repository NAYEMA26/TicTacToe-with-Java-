
package Android;


public class TicTacToe{
   static  char[][] board;
    
    public  TicTacToe()
    {
      board=  new char[3][3] ;
      input();
    }
    
    void input()
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
                
            }
        }
    }
    
   static  void disPlayBoard()
    {
        System.out.println("The Game Structure : ");
        System.out.println("     1    2     3    ");
        System.out.println("---------------------");
         for (int i = 0; i < board.length; i++) {
             System.out.print(i+1+"  |  ");
            for (int j = 0; j < board[i].length; j++) {
                
                System.out.print(board[i][j]+"  |  ");
            }
             System.out.println("");
             System.out.println("---------------------");

        }
    }
    
  static  void placeMark(int row, int column, char mark)
    {
       // board[row][column] = mark;
        if(row>= 0 && row <=2 && column >=0 && column<=2)
        {
             board[row][column] = mark;

        }
        else
            System.out.println("Ivalid Input- (Nayema26) ");
    }
    
    static  boolean  checkClolWin(){
           for (int j = 0; j <board.length; j++) {
            if(board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]){
                return true;
            }
        }
           return false;
    }
    
    static boolean checkRowWin(){
        
        for (int i = 0; i <=2; i++) {
            if(board[i][0] !=' ' && board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2])
            {
                return true;
            }
        }
        
        return false;
    }
    
    static boolean checkDiagWin(){
        if(board[0][0] != ' ' && board[0][0] == board[1][1]
                && board[1][1] == board[2][2]
                || board[0][2] !=' ' && board[0][2] == board[1][1]
                && board[1][1] == board[2][0])
        {
            return true;
        }
        return false;
    }
    
    static boolean isDraw()
    {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <=2; j++) {
                if(board[i][j] == ' ')
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}