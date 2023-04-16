package skit.theory_01_input_space;

import java.util.List;


public class TriangleClass {
    enum Triangle {
        Scalene, Isosceles, Equilateral, Invalid
    }

    public static Triangle triang(int Side1, int Side2, int Side3) {
        // ...
        return Triangle.Invalid;
    }

    public boolean findElement(List list, Object element) {
        // ...
        return false;
    }
// Effects: if list or element is null throw NullPointerException
// else return true if element is in the list, false otherwise

}
