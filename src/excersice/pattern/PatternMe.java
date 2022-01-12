package excersice.pattern;

import java.util.Scanner;

public class PatternMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows = sc.nextInt();
        for (int ro=0;ro<rows;ro++){
            for (int star=0; star<ro;star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int ro=0; ro<rows;ro++){
            for (int star=0;star<rows-ro;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
