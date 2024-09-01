package TicTocToe;

abstract public class player {
    String name;
    char mark;
    abstract void makeMove();

    boolean isValidMove(int row, int col)
    {
        if(row >= 0 && row < 3 && col >= 0 && col < 3 && tic_tac_toe.board[row][col] == ' ')
        {
            return true;
        }
        return false;
    }
}
