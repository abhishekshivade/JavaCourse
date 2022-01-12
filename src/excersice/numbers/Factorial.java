package excersice.numbers;

import java.util.Scanner;

public class Factorial {
    static Integer n, res = 1;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    Integer n = sc.nextInt();
    Integer m = n;

    for (Integer i = 1; i != n; n--){
        fact(n);
    }

    System.out.println("Factorial of "+ m + " = "+ res);

    sc.close();

    }

   static Integer fact( Integer n){
        return res *= n;

    }
}
