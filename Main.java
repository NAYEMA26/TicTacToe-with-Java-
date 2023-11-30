
package Android;
/**
 *
 * @author NAYEMA FERDOUSHI 
 * DATE 15-10-2023 
 */
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
         TicTacToe tic = new TicTacToe();
        // tic.disPlayBoard();
         tic.placeMark(0, 0, 'X');
         tic.placeMark(2,1, 'O');
         tic.disPlayBoard();
         System.out.println(tic.checkClolWin() );
    }
}

class HumanPlayer extends Player {
          
     HumanPlayer(String name, char mark){
         this.name = name;
         this.mark = mark;
     }
     
     void makeMove(){
         Scanner sc = new Scanner(System.in);
         int row;
         int column;
         do{
              System.out.println("Enter the row and column : ");
         
          row = sc.nextInt()-1;
          column = sc.nextInt()-1;
         } while(!(isValidMove(row,column)));
         
         TicTacToe.placeMark(row, column, mark);
     }
     
    /* boolean isValidMove(int row, int column)
     {
         if(row >=0 && row<=2 && column>=0 && column<=2){
             if(TicTacToe.board[row][column]==' ')
                 return true;
         }
         return false;
     }*/
}

class AIPlayer  extends Player{
     //String name;
    // char mark;
     
     AIPlayer(String name, char mark){
         this.name = name;
         this.mark = mark;
     }
     
     void makeMove(){
         Scanner sc = new Scanner(System.in);
         int row;
         int column;
        do
        {
            Random ran = new Random();
           row = ran.nextInt(3);
           column = ran.nextInt(3);
        }
         while(!(isValidMove(row,column)));
         
         TicTacToe.placeMark(row, column, mark);
     }
     
    /* boolean isValidMove(int row, int column)
     {
         if(row >=0 && row<=2 && column>=0 && column<=2){
             if(TicTacToe.board[row][column]==' ')
                 return true;
         }
         return false;
     }*/
}
