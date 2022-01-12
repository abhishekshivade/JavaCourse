package excersice.numbers;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer number = sc.nextInt();
        fibonacci(number);
        sc.close();
    }

    static void fibonacci(Integer number){
        Integer firstNum = 0, thirdNum = 0, secondNum = 1;

        while (thirdNum < number){
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }

        if (thirdNum == number)
            System.out.println(number+" belongs to Fibonacci series");
        else

            System.out.println(number+" does not belongs to Fibonacci series");
    }

}
