import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnittestTest {

    @Test
    @DisplayName("2+1=3")
    void addsTwoNumbers() {
        JUnittest jUnittest = new JUnittest();
        assertEquals(3, JUnittest.add(2,1), "2+1 should be 3");
    }

}