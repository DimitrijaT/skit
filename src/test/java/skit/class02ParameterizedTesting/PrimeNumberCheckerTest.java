package skit.class02ParameterizedTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCheckerTest {

    private PrimeNumberChecker primeNumberChecker;

    @BeforeEach
    public void init() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    // Array that we can give it to a test later wrapped as a Collection
    public static Collection<Object[]> numbers() {
        return Arrays.asList(new Object[][]{
                {2, true},
                {6, false},
                {28, false},
                {19, true}
        });
    }

    // Same as if we typed 4 different tests
    @ParameterizedTest
    @MethodSource("numbers")
    public void testPrimeNumberChecker(int number, boolean expectedResult) {
        System.out.println(String.format("Number: %d  Expected Result: %b",number,expectedResult));
        assertEquals(expectedResult, primeNumberChecker.validate(number));
    }
}