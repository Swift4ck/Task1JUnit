import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void beforeAll() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Сложение двух чисел даст результат 2")
    void testAddPositive() {
        int result = calculator.add(1, 1);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Сложение двух чисел даст результат -2")
    void testAddNegative() {
        int result = calculator.add(4, -6);
        assertEquals(-2, result);
    }


    @Test
    @DisplayName("Вычитание двух чисел даст результат 2")
    void testSubtractPositive() {
        int result = calculator.subtract(4, 2);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Умножение двух чисел даст результат 24")
    void testMultiplyPositive() {
        int result = calculator.multiply(4, 6);
        assertEquals(24, result);
    }

    @Test
    @DisplayName("Умножение двух чисел даст результат -24")
    void testMultiplyNegative() {
        int result = calculator.multiply(4, -6);
        assertEquals(-24, result);
    }

    @Test
    @DisplayName("Деление двух чисел даст результат 10")
    void testDividePositive() {
        double result = calculator.divide(40, 4);
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Деление двух чисел даст результат с дробью")
    void testDivideWithFraction() {
        double result = calculator.divide(10, 4);
        assertEquals(2.5, result);
    }

    @Test
    @DisplayName("Деление на ноль выбросит исключение")
    void testDivideException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }


}
