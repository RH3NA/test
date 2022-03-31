import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTest{

    @Test
    void test1() {
        int actualLength = "XYZ".length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);
    }

    @Test
    void test2() {
        assertEquals(4, (Math.min(3, 7)));
    }

    @Test
    void toUpperCase() {
        java.lang.String str = "xyz";
        java.lang.String result = str.toUpperCase();
        assertEquals("XYZ", result);
    }

    @Test
    void contains_basic() {
        java.lang.String str = "abcd";
        boolean result = str.contains("ihk");
        assertTrue(result);

    }

}