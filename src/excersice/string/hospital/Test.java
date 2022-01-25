package excersice.string.hospital;

import controlstatement.SwitchCase;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Doctor d = new Doctor();
        Patient p = new Patient();
        Scanner sc = new Scanner(System.in);
        Integer choice;

        do {
            System.out.println("Registration");
            System.out.println("1. Doctor\n2. Patient\n3. Exit");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    d.setDetails();
                    break;

                case 2:
                    p.setDetails();
                    break;

                case 3:
                    System.exit(0);
                    break;
            }

        }while (choice != 0 || choice <=3);

        sc.close();
    }
}
