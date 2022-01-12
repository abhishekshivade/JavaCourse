package controlstatement;

import java.util.Scanner;

public class Excersice1 {
    public static void main(String[] args) {
        int x=0, y=0, r = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        x = sc.nextInt();
        System.out.println("Enter Y");
        y = sc.nextInt();
        while (y!=0){ //y>0 or y>=0
            r*=x;
            --y;
        }
        System.out.println(r);
    }
}
