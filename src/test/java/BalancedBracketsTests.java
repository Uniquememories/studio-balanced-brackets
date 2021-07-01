import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedBracketsTests {

    @Test
    public void starterTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testBasicBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testDoubleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testTripleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void testWordInBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testPartWordInBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testWordAfterBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testWordBeforeBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void testOpenBracketNotClosed() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testClosedBracketNotOpened() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testTwoOpenBracketsNotClosed() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void testTwoClosedBracketsNotOpened() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void testBracketClosedWithBasicBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }

    @Test
    public void testBracketOpenedWithBasicBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

}
