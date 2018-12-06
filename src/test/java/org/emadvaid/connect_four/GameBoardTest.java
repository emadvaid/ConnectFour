package org.emadvaid.connect_four;

public class GameBoardTest extends TestCase {

    /*
     *  Test case that test creating a player object.
     */
    public void testCreateGameBoard() {
    }

    public void testPrintGameBoard() {}

    public static boolean run(){

        // create two counters to keep track of the number of passed test,
        //   and the number of tests taken
        int nTests = 0;
        int nPassed = 0;

        // Step 1 - create a instance of the PlayerTest class,
        //   and save that value in a variable called tester
        //   (type of the variable should match the type of the value)
        GameBoardTest tester = new GameBoardTest();

        // Step 2 - run the testCreatePlayer test, on the tester object
        try {
            // first increment test counter
            nTests++;
            // run the test
            System.out.println("Running testCreateGameBoard:");
            tester.testCreateGameBoard();
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
            System.out.println("Running testPrintGameBoard:");
            tester.testPrintGameBoard();
            // update the pass counter
            nPassed++;
        } catch(Exception e) {
            System.out.println("\t" + e);
        }

        if(nTests == nPassed) {
            System.out.println("All test passed");
            return true;
        } else {
            System.out.println("Failed " + (nTests - nPassed) + " tests out of " + nTests);
            return false;
        }
    }
}
