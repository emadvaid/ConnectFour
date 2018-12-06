package org.emadvaid.connect_four;
import java.io.*;




public class GameBoard {
    // Constants
    public static final char EMPTY = 'X';
    public static final char RED = 'R';
    public static final char BLACK = 'B';

    // Instance variables
    private final int nrows;
    private final int ncols;
    private final char board[][];

    public GameBoard(int nrows, int ncols) {
        this.nrows = nrows;
        this.ncols = ncols;

        this.board = new char[nrows][ncols];
        // initialize the board to empty
        //  set all the cells in each row and column to EMPTY
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

}
