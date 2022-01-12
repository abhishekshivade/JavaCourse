package controlstatement;

import java.util.Scanner;

public class ExcersiceForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int even[] = new int[5];
        int odd[] = new int[5];
        int j = 0;
        int k =0;
        System.out.println("Enter Number in Array ");

        for (int i=0; i<10; i++){
            int no;
            no = sc.nextInt();
            a[i] =no;
        }

        for (int i=0; i<10;i++){
            if (a[i]%2==0) {
                even[j] = a[i];
                j++;
            }
            else {
                odd[k] = a[i];
                k++;
            }
        }

        System.out.println("Even Array");
        for (int i=0;i<5;i++){
            System.out.print(even[i]+"\t");
        }
        System.out.println();
        System.out.println("Odd Array");
        for (int i=0;i<5;i++){
            System.out.print(odd[i]+"\t");
        }


    }
}
