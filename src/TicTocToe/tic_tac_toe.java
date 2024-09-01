package TicTocToe;

public class tic_tac_toe {
    static char[][] board;

    public tic_tac_toe() {
        board = new char[3][3];
        initBoard();
    }
    void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    static void display()
    {
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-----------");
        }
    }
    static boolean isValid(int row, int col)
    {
        if(row >= 0 && row < 3 && col >= 0 && col < 3)
        {
            return true;
        }
        return false;
    }
    static void marking(char mark, int row, int col)
    {
        if (isValid(row, col))
        {
            board[row][col] = mark;
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
    static boolean checkRow()
    {
        for (int i = 0; i < 3; i++)
        {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }
    static boolean checkCol()
    {
        for (int j = 0; j < 3; j++)
        {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j])
            {
                return true;
            }
        }
        return false;
    }
    static boolean checkDiagonal()
    {
        if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
        {
            return true;
        }
        return false;
    }
}