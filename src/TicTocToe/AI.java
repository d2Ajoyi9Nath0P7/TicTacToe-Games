package TicTocToe;

import java.util.Random;
import java.util.Scanner;

public class AI extends player{
    public AI(String name,char mark)
    {
        this.name = name;
        this.mark = mark;
    }
    public void makeMove()
    {
        while(true)
        {
            Random rand = new Random();
            System.out.print("Row and Col : ");
            int row = rand.nextInt(3)+1;
            int col = rand.nextInt(3)+1;
            System.out.println(row+" "+col);
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
