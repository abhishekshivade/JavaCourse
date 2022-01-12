package excersice.Recursion;

import java.util.Scanner;

public class Factorial {
   static Integer res = 1;
   static Integer n = 5;
    public static void main(String[] args) {
        System.out.println("Factorial of "+ n +" = "+ cal(n));
    }


    static Integer cal(Integer n){
        if (n == 1) {
            return 1;
        }
        else {
            return res * cal(n - 1);
        }
    }
}
