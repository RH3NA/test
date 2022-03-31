import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class StringTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Initialize connection to database");
    }

    @BeforeEach
    void beforeEach(TestInfo info) {
        System.out.println("Initialize test for " + info.getDisplayName());
    }

    @Test
    @Disabled
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
    @RepeatedTest(2)
    void contains_basic() {
        java.lang.String str = "abcd";
        boolean result = str.contains("ihk");
        assertTrue(result);

    }

    @Test
    void split_basic() {
        java.lang.String str = "abcd yzjl";
        java.lang.String[] result = str.split(" ");
        java.lang.String[] expectedResult = new java.lang.String[]{ "abcd", "yzjl"};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void length_exception() {
        java.lang.String str = "AB";
        assertThrows(NullPointerException.class, () -> {
            str.length();
        }
        );
    }

    @ParameterizedTest
    @ValueSource(strings= {"ABC", "", "A", "ABCx","ABC75"})
    void length_greater_than_0(java.lang.String str) {
        assertTrue(str.length()>0);
    }

    @ParameterizedTest(name = "{0} toUppercase is {1}")
    @CsvSource(value= {"abc, ABC",",","a, A","ABCDX, abcdx"})
    void uppercase(java.lang.String word, java.lang.String capitalizedWord) {
        assertEquals(capitalizedWord, word.toUpperCase());

    }

    @Test
    void performanceTest() {
        assertTimeout(Duration.ofSeconds(1),
                () -> {
            for (int i = 0; i <= 1000000; i++) {
                int j = i;
                System.out.println(j);
            }
                }
                );
    }




    }

