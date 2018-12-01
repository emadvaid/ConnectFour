package org.emadvaid.connect_four;

public class Player {

    private final String name;

    private int nplayed;
    private int nwins;

    public Player(String name) {
        this.name    = name;
        this.nplayed = 0;
        this.nwins   = 0;
    }

    public void addWin() {
        nwins++;
    }

    public void addLoss() {
        nwins--;
    }

    public float getWinRatio() {
        return getWins()/getTotalGamesPlayed();
    }

    public float getLossRatio() {
        return getTotalGamesPlayed() - getWins()/ getTotalGamesPlayed();
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return nwins;
    }

    public int getTotalGamesPlayed() {
        return nplayed;
    }
}
