package org.emadvaid.connect_four;

public class ConnectFour {
    // instance variable
    private final int nrows;
    private final int ncols;
    private final int nInARow;

    public ConnectFour(int nrows, int ncols, int nInARow) {
        this.nrows = nrows;
        this.ncols = ncols;
        this.nInARow = nInARow;
    }

    public void run() {
        // first create a game board
        GameBoard board = new GameBoard(nrows, ncols);


    }



    // program entry point
    public static void main(String args[]) {
        int nrows  = 6;
        int ncols = 7;
        int nInARow = 4;

        ConnectFour game = new ConnectFour(nrows, ncols, nInARow);
        game.run();
    }
}
