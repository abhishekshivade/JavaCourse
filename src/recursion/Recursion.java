package recursion;

import java.util.Scanner;

/**
 *
 * Definition ==> Calling method itself continuously
 *
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Sum is " + sum(5));
    }

    static Integer sum(Integer n) {
        Integer res = 0;
        System.out.println(res);
        if (n > 0)
            return (res + sum(n - 1));
        else
            return n;
    }
}
