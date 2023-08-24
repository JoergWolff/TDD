import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void returnFibonacci0_whenNumberIs0() {
        //Given
        int n = 0;
        //When
        int actual = Fibonacci.calculateFibonacci(n);
        //Then
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void returnFibonacci1_whenNumberIs1() {
        //Given
        int n = 1;
        //When
        int actual = Fibonacci.calculateFibonacci(n);
        //Then
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void returnFibonacci1_whenNumberIs2() {
        int n = 2;
        int actual = Fibonacci.calculateFibonacci(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void returnFibonacci21_whenNumberIs8() {
        int n = 8;
        int actual = Fibonacci.calculateFibonacci(n);
        int expected = 21;
        assertEquals(expected, actual);
    }

}