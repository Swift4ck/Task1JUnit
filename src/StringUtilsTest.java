import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    private static StringUtils stringUtils;

    @BeforeAll
    public static void beforeAll() {
        stringUtils = new StringUtils();
    }

    @Test
    @DisplayName("Слово level даст истину")
    void StringLevelTrue(){
        String result = "level";
        assertTrue(stringUtils.isPalindrome(result));
    }

    @Test
    @DisplayName("Слово hello даст ложь")
    void StringHelloFalse(){
        String result = "hello";
        assertFalse(stringUtils.isPalindrome(result));
    }


    @Test
    @DisplayName("Слово hello даст ложь")
    void StringTrue(){
        String result = "";
        assertTrue(stringUtils.isPalindrome(result));
    }

    @Test
    @DisplayName("null даст ложь")
    void StringNullFalse(){
        String result = null;
        assertFalse(stringUtils.isPalindrome(result));
    }

    @Test
    @DisplayName("Слово RaceCar даст истину")
    void StringRaceCarTrue(){
        String result = "RaceCar";
        assertTrue(stringUtils.isPalindrome(result));
    }

}