package excersice.pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int a = sc.nextInt();
        for (int i=0; i<a;i++){
            for (int k=0;k<a-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
