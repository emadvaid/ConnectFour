package org.emadvaid.connect_four;

public class ConnectFour {
    // instance variable
    private final int nrows;
    private final int ncols;

    public ConnectFour(int nrows, int ncols) {
        this.nrows = nrows;
        this.ncols = ncols;
    }

    public void run() {

    }

    // program entry point
    public static void main(String args[]) {
        int nrows  = 6;
        int ncols = 7;

        ConnectFour game = new ConnectFour(nrows, ncols);
        game.run();
    }
}
