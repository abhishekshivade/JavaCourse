package excersice.matrix;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in Array A");
        for (int i = 0; i< a.length; i++) {
            for (int j = 0; j< a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Elements in Array B");
        for (int i = 0; i< b.length; i++) {
            for (int j = 0; j< b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i< c.length; i++) {
            for (int j = 0; j< c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Array A = ");
        for (int i = 0; i< a.length; i++){
            for (int j =0; j< a.length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Array B = ");
        for (int i = 0; i< b.length; i++){
            for (int j =0; j< b.length; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Array c = ");
        for (int i = 0; i< c.length; i++){
            for (int j =0; j< c.length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
