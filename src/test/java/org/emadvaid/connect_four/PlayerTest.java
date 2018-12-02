package org.emadvaid.connect_four;

public class PlayerTest {

    private static int fails;

    /*
     *  Test case that test creating a player object.
     */
    public void testCreatePlayer() {
        // create a new instance of the Player Class (creating an object of type ...),
        //   and save it to a variable named player1 of type Player
        Player player1 = new Player("Player1");

        assertNotNull("player1", player1 == null);
        assertEquals("player1.getName()","Player1", player1.getName());
        assertEquals("player1.getWins()", 0, player1.getWins());
        assertEquals("player1.getTotalGamesPlayed()", 0, player1.getTotalGamesPlayed());
        assertEquals("player1.getWinRatio()", 0.0, player1.getWinRatio());
        assertEquals("player1.getLossRatio()", 0.0, player1.getLossRatio());
    }

    public void testAddWinToPlayer() {
        // create a new instance of the Player Class (creating an object of type ...),
        //   and save it to a variable named player1 of type Player
        Player player1 = new Player("Player1");

        assertNotNull("player1", player1 == null);
        assertEquals("player1.getName()","Player1", player1.getName());

        player1.addWin();
        assertEquals("after 1 win - player1.getWins()", 1, player1.getWins());
        assertEquals("after 1 win - player1.getTotalGamesPlayed()", 1, player1.getTotalGamesPlayed());
        assertEquals("after 1 win - player1.getWinRatio()", 1.0, player1.getWinRatio());
        assertEquals("after 1 win - player1.getLossRatio()", 0.0, player1.getLossRatio());

        player1.addWin();
        assertEquals("after 2 wins - player1.getWins()", 2, player1.getWins());
        assertEquals("after 2 wins - player1.getTotalGamesPlayed()", 2, player1.getTotalGamesPlayed());
        assertEquals("after 2 wins - player1.getWinRatio()", 1.0, player1.getWinRatio());
        assertEquals("after 2 wins - player1.getLossRatio()", 0.0, player1.getLossRatio());

        player1.addWin();
        assertEquals("after 3 wins - player1.getWins()", 3, player1.getWins());
        assertEquals("after 3 wins - player1.getTotalGamesPlayed()", 3, player1.getTotalGamesPlayed());
        assertEquals("after 3 wins - player1.getWinRatio()", 1.0, player1.getWinRatio());
        assertEquals("after 3 wins - player1.getLossRatio()", 0.0, player1.getLossRatio());

        player1.addWin();
        assertEquals("after 4 wins - player1.getWins()", 4, player1.getWins());
        assertEquals("after 4 wins - player1.getTotalGamesPlayed()", 4, player1.getTotalGamesPlayed());
        assertEquals("after 4 wins - player1.getWinRatio()", 1.0, player1.getWinRatio());
        assertEquals("after 4 wins - player1.getLossRatio()", 0.0, player1.getLossRatio());
    }

    public void testAddLossToPlayer() {
        // create a new instance of the Player Class (creating an object of type ...),
        //   and save it to a variable named player1 of type Player
        Player player1 = new Player("Player1");

        assertNotNull("player1", player1 == null);
        assertEquals("player1.getName()","Player1", player1.getName());

        player1.addLoss();
        assertEquals("after 1 loss - player1.getWins()", 0, player1.getWins());
        assertEquals("after 1 loss - player1.getTotalGamesPlayed()", 1, player1.getTotalGamesPlayed());
        assertEquals("after 1 loss - player1.getWinRatio()", 0.0, player1.getWinRatio());
        assertEquals("after 1 loss - player1.getLossRatio()", 1.0, player1.getLossRatio());

        player1.addLoss();
        assertEquals("after 2 losses - player1.getWins()", 0, player1.getWins());
        assertEquals("after 2 losses - player1.getTotalGamesPlayed()", 2, player1.getTotalGamesPlayed());
        assertEquals("after 2 losses - player1.getWinRatio()", 0.0, player1.getWinRatio());
        assertEquals("after 2 losses - player1.getLossRatio()", 1.0, player1.getLossRatio());

        player1.addLoss();
        assertEquals("after 3 losses - player1.getWins()", 0, player1.getWins());
        assertEquals("after 3 losses - player1.getTotalGamesPlayed()", 3, player1.getTotalGamesPlayed());
        assertEquals("after 3 losses - player1.getWinRatio()", 0.0, player1.getWinRatio());
        assertEquals("after 3 losses - player1.getLossRatio()", 1.0, player1.getLossRatio());

        player1.addLoss();
        assertEquals("after 4 losses - player1.getWins()", 0, player1.getWins());
        assertEquals("after 4 losses - player1.getTotalGamesPlayed()", 4, player1.getTotalGamesPlayed());
        assertEquals("after 4 losses - player1.getWinRatio()", 0.0, player1.getWinRatio());
        assertEquals("after 4 losses - player1.getLossRatio()", 1.0, player1.getLossRatio());
    }

    public static void main(String args[]){

        // create two counters to keep track of the number of passed test,
        //   and the number of tests taken
        int nTests = 0;
        int nPassed = 0;

        // Step 1 - create a instance of the PlayerTest class,
        //   and save that value in a variable called tester
        //   (type of the variable should match the type of the value)
        PlayerTest tester = new PlayerTest();

        // Step 2 - run the testCreatePlayer test, on the tester object
        try {
            // first increment test counter
            nTests++;
            // run the test
            System.out.println("Running testCreatePlayer:");
            tester.testCreatePlayer();
            // update the pass counter
            nPassed++;
        } catch(Exception e) {
            System.out.println("\t" + e);
        }

        // Step 3 - run the testAddWinToPlayer test, on the tester object
        try {
            // first increment test counter
            nTests++;
            // run the test
            System.out.println("Running testAddWinToPlayer:");
            tester.testAddWinToPlayer();
            // update the pass counter
            nPassed++;
        } catch(Exception e) {
            System.out.println("\t" + e);
        }

        // Step 3 - run the testAddLossToPlayer test, on the tester object
        try {
            // first increment test counter
            nTests++;
            // run the test
            System.out.println("Running testAddLossToPlayer:");
            tester.testAddLossToPlayer();
            // update the pass counter
            nPassed++;
        } catch(Exception e) {
            System.out.println("\t" + e);
        }

        if(nTests == nPassed) {
            System.out.println("All test passed");
        } else {
            System.out.println("Failed " + (nTests - nPassed) + " tests out of " + nTests);
        }
    }

    protected void assertNotNull(String name, Object o) {
        if(o == null) {
            throw new RuntimeException(name + ": Assert not Null failed on test object: " + o);
        }
    }

    protected void assertNull(String name, Object o) {
        if(o != null) {
            throw new RuntimeException(name + ": Assert Null failed on test object: " + o);
        }
    }

    protected void assertEquals(String name, double expected, double actual) {
        if(Math.abs(expected - actual) > .00001) {
            throw new RuntimeException(name + ": Assert equals failed"
                    + " expected = " + expected
                    + " actual = " + actual);
        }
    }

    protected void assertEquals(String name, float expected, float actual) {
        if(Math.abs(expected - actual) > .00001) {
            throw new RuntimeException(name + ": Assert equals failed"
                    + " expected = " + expected
                    + " actual = " + actual);
        }
    }

    protected void assertEquals(String name, int expected, int actual) {
        if(expected != actual) {
            throw new RuntimeException(name + ": Assert equals failed"
                    + " expected = " + expected
                    + " actual = " + actual);
        }
    }

    protected void assertEquals(String name, Object expected, Object actual) {
        if(!expected.equals(actual)) {
            throw new RuntimeException(name + ": Assert equals failed"
                    + " expected = " + expected
                    + " actual = " + actual);
        }
    }
}
