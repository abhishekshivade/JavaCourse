package excersice.CustomException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        double amount;
        char ch = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Select an option");
            System.out.println("1. Withdraw Cash\n2. Deposit cash");
            Integer option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter Withdraw Amount :");
                    amount = sc.nextDouble();
                    sbi.withdraw(amount);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter Deposit Amount :");
                    amount = sc.nextDouble();
                    sbi.deposit(amount);
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid option");
                    System.out.println();
            }

            System.out.println("Do you want to continue a transaction : Y/N");
            ch = sc.next().charAt(0);

        }while (ch =='y');
        sc.close();
    }

}
