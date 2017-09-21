/**
 * Written by: C. West
 * Exercise: 7.19  
 * Date: 03/18/2014
 * Purpose: Just a game of Tic-Tac-Toe
 **/
import java.util.*;

public class TicTacToe {
    // Global Variables
    public static Scanner in = new Scanner(System.in);
    public static int player1 = 88;
    public static int player2 = 79;
    public static int player0 = 0;
    
    public static void main(String[] args) {
         // Declarations
        int x;
        
        int [][] board = new int [3][3];
        String Game = "It's a Game of tic-tac-toe. Two players take turns marking the board with either an X or O.";
        String Line = "- - - - - - - - - - - - - -", Space = " ";
        String Line2 ="- - - - - - -";
        // Display Output of Game
        System.out.println(Game);
        System.out.println(Space);
        System.out.println( " T | " + " I | " + " C ");
        System.out.println(Line2);
        System.out.println( " T | " + " A | " + " C ");
        System.out.println(Line2);
        System.out.println( " T | " + " O | " + " E ");
        System.out.println(Space);
        
        for (x = 1; x <= 3; x++) 
        {
            System.out.println(Line);
                UserInputX(board);
            System.out.println(Space);
                displayBoard(board);
            System.out.println(Space);
                UserInputO(board);
            System.out.println(Space);
                displayBoard(board);
            System.out.println(Space);
        }
        WinnerCheck(board);
            
            for (x = 3; x < 4; x++){
               System.out.println(Line);
                UserInputX(board);
               System.out.println(Space);
                displayBoard(board);
               System.out.println(Space);
                UserInputO(board);
               System.out.println(Space);
                displayBoard(board);
               System.out.println(Space);  
            }
            for (x = 4; x < 5; x++){
               System.out.println(Line);
                UserInputX(board);
               System.out.println(Space);
                displayBoard(board);
            }
       WinnerCheck(board);
       StalemateCheck(board);
    }
    //rewrite board
     public static void displayBoard(int [][] board){
            String line = "- - - - - - - - - ";
            
         int row, column;
         
         for (row = 0; row < 3; row++){
             for(column = 0; column < 3; column++){
                 
         int XorO = board[row][column];
                 if( XorO == 88){
                     System.out.print(" | X");
                 }
                 else if(XorO  == 79)
                 {
                     System.out.print(" | O");
                 }
                 else if(XorO  == 0)
                 {
                     System.out.print(" |  ");
                     
                 }
             }
             System.out.println(" | ");
             System.out.println(line);
             
             
         } 
            
    }
    public static void UserInputX (int [][] board) {
        // Method Declarations
        int row, column;
        String XrowQuest = "Player X, Enter row number either 0, 1, or 2: ";
        String XcolumnQuest = "Player X, enter column number either 0, 1, or 2: ";
        boolean answerValid = false;
        
        
            // Ask For Player X Input
        do {
                System.out.print(XrowQuest);
                row = in.nextInt();
                System.out.print(XcolumnQuest);
                column = in.nextInt();
            
                if (board[row][column]!=88&& board[row][column] != 79)
                {
                
                    board[row][column] = player1;
                    answerValid = true;
                }
                else 
                {
               System.out.println();
               System.out.println("WARNING: That row and column coordinate is already taken please enter a different row and column.");  
               
                }
            }
                while (!answerValid);
         
        }
        
    public static void UserInputO (int [][] board){
       // Method Declarations
        int row, column;
        String OrowQuest = "Player O, enter row number either 0, 1, or 2: ";
        String OcolumnQuest = "Player O, enter column number either 0, 1, or 2: ";
        boolean answerValid = false;
        
        do 
        {
            System.out.print(OrowQuest);
            row = in.nextInt();
            System.out.print(OcolumnQuest);
            column = in.nextInt();
            
            
            if (board[row][column]!=88&& board[row][column] != 79)
            {
                board[row][column] = player2;
                answerValid = true;
            } 
            else 
            {
               System.out.println();
               System.out.println("WARNING: That row and column coordinate is already taken please enter a different row and column.");    
            }
        } 
        while (!answerValid);
    }
    
    public static void StalemateCheck (int [][] board) {
            System.out.println("This ends in a Stalemate.");
            System.exit(0);
    }
        
    public static void WinnerCheck (int [][] board) {
         String winX = "Player X has won!";
         String winO = "Player O has won!";
         
        // Checking Player X and Player O for Winner 
if ( (board[0][0]== 88 && board[0][1]== 88 && board[0][2]==88) ||
(board[1][0]== 88 && board[1][1]== 88 && board[1][2]==88) ||
(board[2][0]== 88 && board[2][1]== 88 && board[2][2]==88) ||
(board[0][0]== 88 && board[1][0]== 88 && board[2][0]==88) ||
(board[0][1]== 88 && board[1][1]== 88 && board[2][1]==88) ||
(board[0][2]== 88 && board[1][2]== 88 && board[2][2]==88) ||
(board[0][0]== 88 && board[1][1]== 88 && board[2][2]==88) ||
(board[0][2]== 88 && board[1][1]== 88 && board[2][0]==88) )
{
System.out.println(winX);
System.exit(0);
}
else if ( (board[0][0]== 2 && board[0][1]== 2 && board[0][2]==2) ||
(board[1][0]== 2 && board[1][1]== 2 && board[1][2]==2) ||
(board[2][0]== 2 && board[2][1]== 2 && board[2][2]==2) ||
(board[0][0]== 2 && board[1][0]== 2 && board[2][0]==2) ||
(board[0][1]== 2 && board[1][1]== 2 && board[2][1]==2) ||
(board[0][2]== 2 && board[1][2]== 2 && board[2][2]==2) ||
(board[0][0]== 2 && board[1][1]== 2 && board[2][2]==2) ||
(board[0][2]== 2 && board[1][1]== 2 && board[2][0]==2) )
{
System.out.println(winO);
System.exit(0);
}
        
    }
}