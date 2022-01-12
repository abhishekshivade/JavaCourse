package excersice.pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int a = sc.nextInt();
        for (int i = a; i >= 1; i--){
            for (int j = 1; j <= a-i; j++ ){
                System.out.print("  ");
            }

            for (int k = i; k <= 2 * i - 1; k++){
                System.out.print("* ");
            }

            for (int j = 0; j < i - 1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
/**
 *
 * */
//        int rows = sc.nextInt();
//        for (int i = rows; i >= 1; --i){
//            for (int space = 1; space <= rows - i; ++space){
//                System.out.print("  ");
//            }
//            for (int j=i; j <=2 * i - 1; ++j){
//                System.out.print("* ");
//            }
//            for (int j = 0; j < i - 1; ++j){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        sc.close();

    }
}
