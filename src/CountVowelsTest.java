
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountVowelsTest {

    private static CountVowels countVowels;

    @BeforeAll
    public static void beforeAll() {
        countVowels = new CountVowels();
    }

    @Test
    @DisplayName("Слово hello должно показать значение 2")
    void CountVowelsWillShowResult2 (){
        int res = countVowels.countVowels("hello");
        assertEquals(2, res);
    }

    @Test
    @DisplayName("Слово xyz должно показать значение 0")
    void CountVowelsWillShowResult0 (){
        int res = countVowels.countVowels("xyz");
        assertEquals(0, res);
    }

    @Test
    @DisplayName("String c пустотой должен показать значение 0")
    void CountVowelsZero (){
        int res = countVowels.countVowels("");
        assertEquals(0, res);
    }


    @Test
    @DisplayName("null должен показать значение 0")
    void CountVowelsNullThisZero (){
        int res = countVowels.countVowels(null);
        assertEquals(0, res);
    }


    @Test
    @DisplayName("Слово AEIOU должно показать значение 0")
    void CountVowelsWithLargeConsonantsRes5 (){
        int res = countVowels.countVowels("AEIOU");
        assertEquals(5, res);
    }

}