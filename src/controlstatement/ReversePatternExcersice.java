package controlstatement;

import java.util.Scanner;

public class ReversePatternExcersice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows = sc.nextInt();
     //   int i, j;
//        for( i=0 ; i<rows ; i++ ){
//
//            for ( j=2*(rows-i) ; j>=0 ; j-- ){
//
//                System.out.print(" ");
//
//            }
//
//            for ( j=0 ; j<=i ; j++ ){
//
//                System.out.print(" *");
//
//            }
//
//            System.out.println();
//
//        }
/**
 *
 * */

        for (int i =1; i<=rows; i++){
         for (int j=rows;j>i;j--){
             System.out.print(" ");
         }

         for (int k=1;k<=i;k++){
             System.out.print(" *");
         }

            System.out.println();
        }
       sc.close();
    }
}
