import org.junit.jupiter.api.Test;
import java.math.*;
import static org.junit.jupiter.api.Assertions.*;

class StringTest extends Object {

    @Test
    void test1() {
        int actualLength = "XYZ".length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);
    }
        @Test
        void test2() {
        assertEquals(4, (Math.min(3,7)));
    }
}