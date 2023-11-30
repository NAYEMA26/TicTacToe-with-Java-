
package Android;

public class LaunchGame {
    public static void main(String[] args) {
        
        TicTacToe tic = new  TicTacToe();
        
        HumanPlayer p1 = new HumanPlayer("Tanziro",'X');
        HumanPlayer p2 = new HumanPlayer("Nazuko",'O');
      //  AIPlayer p2 = new AIPlayer("AI-26",'O');
        Player cp;
        cp = p1;
         TicTacToe.disPlayBoard();
       while(true)
       {
           System.out.println(cp.name +" Turn  "+ cp.mark);
        cp.makeMove();
        
        TicTacToe.disPlayBoard();
        if(TicTacToe.checkClolWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin())
        {
            System.out.println(cp.name +" has won " +cp.mark);
            break;
        }
        else if(TicTacToe.isDraw())
        {
            System.out.println("Game is a draw. - -");
            System.out.println("                 -");
            break;
        }
        else
        {
            if(cp == p1){
                cp =p2;
            }
            else
            {
                cp = p1;
            }
        }
        
        
       }
    }
}
