package excersice.numbers;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[10];
//        System.out.println("Enter Number");
//        for (int i=0;i< arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
//        for (int j=0;j< arr.length;j++){
//            if (arr[j]%2 == 0)
//                System.out.println(arr[j]+" is not Prime Number");
//            else if (arr[j]%3 == 0)
//                System.out.println(arr[j]+" is not Prime Number");
//            else if (arr[j]%5 == 0)
//                System.out.println(arr[j]+" is not Prime Number");
//            else if (arr[j]%7 == 0)
//                System.out.println(arr[j]+" is not Prime Number");
//            else
//                System.out.println(arr[j]+" is Prime Number");
//        }
        /**
         *
         * */
        System.out.println("Enter Number");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num/2; i++){
            if (num % i ==0){
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");

        sc.close();
    }
}
