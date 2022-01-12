package excersice.numbers;

import java.util.Scanner;
/**
 * Swap Number without using Third Variable
 * */
public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X");
        int x = sc.nextInt();

        System.out.println("Enter Y");
        int y = sc.nextInt();

        x+=y;
        y=x-y;
        x-=y;

        System.out.println("X = "+x);
        System.out.println("Y = "+y);

        sc.close();
    }
}
