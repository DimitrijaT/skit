package skit.theory_02_graph_coverage_for_source_code;

import java.io.IOException;
import java.util.Scanner;

public class GraphCoverage {


    public int example1If(int x, int y) {

        if (x < y) {
            y = 0;
            x = x + 1;
        } else {
            x = y;
        }

        return x;
    }

    public void example2IfReturnS(int x, int y) {
        if (x < y) {
            return;
        }
        System.out.println(x);
        return;
    }

    public int example3WhileLoop(int x, int y) {
        x = 0;
        while (x < y) {
            y = f(x, y);
            x = x + 1;
        }
        return x;
    }

    public int example4ForLoop(int x, int y) {
        for (x = 0; x < y; x++) {
            y = f(x, y);
        }
        return (x);
    }

    public int f(int x, int y) {
        return x + y;
    }

    public int example5DoLoop(int x, int y) {
        x = 0;
        do {
            y = f(x, y);
            x = x + 1;
        } while (x < y);
        return (y);
    }

    public int example6Switch(int x, int y) {
        x = 0;
        while (x < y) {
            y = f(x, y);
            if (y == 0) {
                break;
            } else if (y < 0) {
                y = y * 2;
                continue;
            }
            x = x + 1;
        }
        return (y);
    }

    public void example7Switch(int x, int y, int z) {
        Scanner scanner = new Scanner(System.in);
        String c;
        c = scanner.next();
        switch (c) {
            case "N":
                z = 25;
            case "Y":
                x = 50;
                break;
            default:
                x = 0;
                break;
        }
        System.out.println(x);
    }

    public String example8Exceptions(int x, int y) {
        Scanner br = new Scanner(System.in);
        String s = "";
        try {
            s = br.nextLine();
            if (s.length() > 96)
                throw new RuntimeException("too long");

            if (s.length() == 0)
                throw new Exception("too short");
        } catch (IOException e) {
            e.printStackTrace();
        } catch
        (Exception e) {
            e.getMessage();
        }
        return s;
    }

}
