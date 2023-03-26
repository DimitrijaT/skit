package class02Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import skit.class02.Division;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisionTest {

    private Division division;

    @BeforeEach
    public void init() {
        division = new Division();
    }

    @Test
    public void testDivision() {
        assertThrows(ArithmeticException.class, () -> division.divide(12, 0));
    }

}