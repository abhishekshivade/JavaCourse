package excersice.pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int a = sc.nextInt();
        for (int i =1; i<=a; i++){
            for (int j=a;j>i;j--){
                System.out.print(" ");
            }

            for (int k=1;k<=i;k++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k = a-i; k>0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
