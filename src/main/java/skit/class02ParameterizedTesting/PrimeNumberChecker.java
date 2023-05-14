package skit.class02ParameterizedTesting;

public class PrimeNumberChecker {
    public Boolean validate(Integer primeNumber) {
        for (int i = 2; i < Math.sqrt(primeNumber * 1.0); i++)
            if (primeNumber % i == 0)
                return false;
        return true;
    }
}

/*
 We expect this as input and output:

 in out
 5 true
 2 true
 6 false

 So we can define this in a parametrized test, like a collection
*/

