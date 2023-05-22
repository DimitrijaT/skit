package skit.theory_09_mutants;

public class Mutants {
    public int Min(int A, int B) {
        int minVal;
        minVal = A;
        if (B < A) {
            minVal = B;
        }
        return (minVal);
    } // end Min

    /*
    6 mutants
    Each represents a separate program
     */

    public int Min1(int A, int B) {
        int minVal;
        minVal = B; // Replace one variable with another
        if (B < A) {
            minVal = B;
        }
        return (minVal);
    } // end Min

    public int Min2(int A, int B) {
        int minVal;
        minVal = A;
        if (B > A) // Replaces operator
        {
            minVal = B;
        }
        return (minVal);
    } // end Min

    public int Min3(int A, int B) {
        int minVal;
        minVal = A;
        if (B < minVal) // Replace one variable with another
        {
            minVal = B;
        }
        return (minVal);
    } // end Min

    public int Min4(int A, int B) {
        int minVal;
        minVal = A;
        if (B < A) {
            Bomb(); // Immediate runtime failure ... if reached
        }
        return (minVal);
    } // end Min

    public int Min5(int A, int B) {
        int minVal;
        minVal = A;
        if (B < A) {
            minVal = A; // Replace one variable with another
        }
        return (minVal);
    } // end Min

    public int Min6(int A, int B) {
        int minVal;
        minVal = A;
        if (B < minVal) {
            minVal = failOnZero(B); // Immediate runtime failure if B==0, else does nothing
        }
        return (minVal);
    } // end Min

    private int failOnZero(int b) {
        return 1;
    }


    private void Bomb() {
    }


}
