package excersice.numbers;

import java.util.Scanner;

public class MinNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter Numbers");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int a=arr[0];

        for (int j=0;j< arr.length;j++){
            if (arr[j]<a)
                a=arr[j];
        }
        System.out.println(a+" is Min Number in Array");
        sc.close();
    }
}
