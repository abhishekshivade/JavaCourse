package excersice.pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
//        int rows = sc.nextInt(), k = 0;
//
//        for (int i = 1; i <= rows; ++i, k = 0) {
//            for (int space = 1; space <= rows - i; ++space) {
//                System.out.print("  ");
//            }
//
//            while (k != 2 * i - 1) {
//                System.out.print("* ");
//                ++k;
//            }
//
//            System.out.println();
//        }
/**
 *
 * */

        int a = sc.nextInt(), k=0;
        for (int i = 1; i <= a; i++, k=0) {
            for (int j=1; j<=a-i; j++){
                System.out.print("  ");
            }
            while (k!=2*i-1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
        sc.close();

    }
}
