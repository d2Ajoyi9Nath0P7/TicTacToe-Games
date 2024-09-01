package TicTocToe;
import java.util.Scanner;

public class Player1 extends player{
    public Player1(String name,char mark)
    {
        this.name = name;
        this.mark = mark;
    }
    public void makeMove()
    {
        while(true)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Row and Col : ");
            int row = input.nextInt();
            int col = input.nextInt();
            row--;
            col--;
            if(isValidMove(row, col))
            {
                tic_tac_toe.marking(mark,row,col);
                break;
            }
            else
            {
                System.out.println("Invalid move and try to valid move : ");
            }
        }
    }
}