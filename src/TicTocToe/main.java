package TicTocToe;

import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        tic_tac_toe ob = new tic_tac_toe();
        tic_tac_toe.display();

        int cnt = 0;
        int option = 0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Playing with Human or AI,playing with human click-1 or playing with AI click-2 : ");
            option = sc.nextInt();
            if(option == 1 || option == 2)
            {
                break;
            }
            else{
                System.out.println("Wrong option, click 1 or 2. Try again.");
            }
        }

        Player1 p1 = new Player1("Player-X",'X');

        if(option == 1){
            System.out.println("Play with Player-X and Player-O : ");

            Player1 p2 = new Player1("Player-0",'O');

            Player1 currentPlayer = p1;


            while(cnt < 9)
            {
                System.out.println(currentPlayer.name+" "+"turn => ");
                currentPlayer.makeMove();
                cnt++;
                tic_tac_toe.display();
                if(tic_tac_toe.checkRow() || tic_tac_toe.checkCol() || tic_tac_toe.checkDiagonal())
                {
                    System.out.println("Congratulation Pookie! "+currentPlayer.name+","+"is Winner of the game!");
                    break;
                }
                else
                {
                    if(cnt >= 9)
                    {
                        System.out.println("Game over,Draw!!!!");
                        break;
                    }
                    if(currentPlayer == p1)
                    {
                        currentPlayer = p2;
                    }
                    else
                    {
                        currentPlayer = p1;
                    }
                }
            }
        }
        else if(option == 2)
        {
            System.out.println("Play with Human and AI : ");

            AI p3 = new AI("AI",'O');
            player currentPlayer = p1;
            while(cnt < 9)
            {
                System.out.println(currentPlayer.name+" "+"turn => ");
                currentPlayer.makeMove();
                cnt++;
                tic_tac_toe.display();
                if(tic_tac_toe.checkRow() || tic_tac_toe.checkCol() || tic_tac_toe.checkDiagonal())
                {
                    System.out.println("Congratulation Pookie! "+currentPlayer.name+","+"is Winner of the game!");
                    break;
                }
                else
                {
                    if(cnt >= 9)
                    {
                        System.out.println("Game over,Draw!!!!");
                        break;
                    }
                    if(currentPlayer == p1)
                    {
                        currentPlayer = p3;
                    }
                    else
                    {
                        currentPlayer = p1;
                    }
                }
            }
        }
    }
}