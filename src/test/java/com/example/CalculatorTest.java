package main.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddOperation() {
        assertEquals(15, calculator.calculate(10, 5, "add"));
    }

    @Test
    public void testAddAgainOperation() {
        assertEquals(15, calculator.calculate(10, 5, "add-again"));
    }

    @Test
    public void testSubOperation() {
        assertEquals(5, calculator.calculate(10, 5, "sub"));
    }

    @Test
    public void testSubAgainOperation() {
        assertEquals(5, calculator.calculate(10, 5, "sub-again"));
    }

    @Test
    public void testMulOperation() {
        assertEquals(50, calculator.calculate(10, 5, "mul"));
    }

    @Test
    public void testDivOperation() {
        assertEquals(2, calculator.calculate(10, 5, "div"));
    }

    @Test
    public void testDivByZero() {
        assertEquals(0, calculator.calculate(10, 0, "div"));
    }

    @Test
    public void testModOperation() {
        assertEquals(0, calculator.calculate(10, 5, "mod"));
    }

    @Test
    public void testPowOperation() {
        assertEquals(100, calculator.calculate(10, 2, "pow"));
    }

    @Test
    public void testInvalidOperation() {
        assertEquals(0, calculator.calculate(10, 5, "invalid"));
    }

    @Test
    public void testAddNumbers() {
        assertEquals(15, calculator.addNumbers(10, 5));
    }

    @Test
    public void testSumValues() {
        assertEquals(20, calculator.sumValues(10, 10));
    }

    @Test
    public void testAddAgain() {
        assertEquals(7, calculator.addAgain(3, 4));
    }
}
