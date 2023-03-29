package skit.class02;

import java.util.HashSet;
import java.util.Set;

public class Division {

    public int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero!");
        return a / b;
    }
}
