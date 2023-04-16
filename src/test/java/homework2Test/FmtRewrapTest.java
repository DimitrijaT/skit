package homework2Test;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import skit.homework02.FmtRewrap;

import static org.junit.Assert.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class FmtRewrapTest {
    private String S;
    private int N;
    private String expected;

    public FmtRewrapTest(String S, int N, String expected) {
        this.S = S;
        this.N = N;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"\n", 3, " \n"},
                {"G", 1, "G\n"}
        });
    }

    @Test
    public void dataFlowTests() {
        assertEquals(expected,
                FmtRewrap.fmtRewrap(S, N), "Data flow FmtRewrapTest");
    }
}