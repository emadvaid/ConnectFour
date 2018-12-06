package org.emadvaid.connect_four;

public class Player {

    private final String name;

    private int nplayed;
    private int nwins;

    public Player(String name) {
        this.name = name;
        this.nplayed = 0;
        this.nwins = 0;
    }

    public void addWin() {
        nwins++;
        nplayed++;
    }

    public void addLoss() {
       nplayed++;
    }

    public float getWinRatio() {


        if (nplayed != 0.0F) {
            return ((float)nwins)/nplayed;
        } else
            return 0.0F;
    }

    public float getLossRatio() {

        if (nplayed != 0) {
            int loss = nplayed - nwins;
            return  ((float)loss) /nplayed;
        }
        return 0.0F;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return nwins ;
    }

    public int getTotalGamesPlayed() {
        return nplayed;
    }
}