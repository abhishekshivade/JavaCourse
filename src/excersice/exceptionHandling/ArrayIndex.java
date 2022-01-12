package excersice.exceptionHandling;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array");
        for (int i=0;i<a.length; i++){
            a[i] = sc.nextInt();
        }
        try{
            System.out.println(a[10]);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sc.close();
        }
        System.out.println("Done...!!!");
    }
}
