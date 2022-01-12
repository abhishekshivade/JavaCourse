package excersice.numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        Integer number = sc.nextInt();

        Integer reminder,armstrong = 0;

        for (Integer i = number; i>0; i = i/10){
            reminder = i%10;
            armstrong = armstrong + (reminder*reminder*reminder);
        }
        if (number == armstrong) {
            System.out.println(armstrong + " is Armstrong Number");
        }
        else {
            System.out.println(armstrong + " is not Armstrong Number");
        }
        sc.close();
    }
}
