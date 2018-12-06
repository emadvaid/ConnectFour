package org.emadvaid.connect_four;

public abstract class TestCase {

    private static int fails;

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
        if(Math.abs(expected - actual) > .001) {
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

    public static void main(String args[]) {
        System.out.println("Running Player tests");
        System.out.println("*******************************");
        PlayerTest.run();
        System.out.println();
        System.out.println();
        System.out.println("Running GameBoard tests");
        System.out.println("*******************************");
        GameBoardTest.run();
    }
}
