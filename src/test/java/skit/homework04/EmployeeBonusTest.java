package skit.homework04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeBonusTest {

    private EmployeeBonus employeeBonus;

    @BeforeEach
    public void init() {
        employeeBonus = new EmployeeBonus();
    }

    /**
     * Major Clause:
     * a - isSenior (1, 5), (2, 6), (4, 8)
     * b - isPartTime (5, 7)
     * c - monthsInCompany (7, 8)
     * 1, 5, 7, 8
     */
    public static Collection<Object[]> employeeParameters() {
        return Arrays.asList(new Object[][]{
                {true, true, 7, true}, // 1: T T T - T
//                {true, true, 3, true}, // 2: T T F - T
//                {true, false, 7, true}, // 3: T F T - T
//                {true, false, 3, true}, // 4: T F F - T
                {false, true, 7, false}, // 5: F T T - F
//                {false, true, 3, false}, // 6: F T F - F
                {false, false, 7, true}, // 7: F F T - T
                {false, false, 3, false} // 8: F F F - F
        });
    }

    @ParameterizedTest
    @MethodSource("employeeParameters")
    void getsBonus(boolean isSenior, boolean isPartTime, int monthsInCompany, boolean expectedResult) {

        System.out.printf("isSenior: %b  isPartTime: %b  monthsInCompany: %d  Expected Result: %b%n",
                isSenior, isPartTime, monthsInCompany, expectedResult);

        Employee employee = new Employee(isSenior, isPartTime, monthsInCompany);

        assertEquals(expectedResult, employeeBonus.getsBonus(employee));
    }
}