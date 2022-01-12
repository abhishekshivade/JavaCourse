package excersice.pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int a = sc.nextInt(), k=0;
        for (int i = 1; i < a; i++, k=0) {
            for (int j=1; j<=a-i; j++){
                System.out.print("  ");
            }
            while (k!=2*i-1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
        for (int i = a; i >= 1; i--){
            for (int j = 1; j <= a-i; j++ ){
                System.out.print("  ");
            }

            for (k = i; k <= 2 * i - 1; k++){
                System.out.print("* ");
            }

            for (int j = 0; j < i - 1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();

    }
}
