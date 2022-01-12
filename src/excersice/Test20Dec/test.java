package excersice.Test20Dec;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager mng = new Manager();

        mng.accept();
        mng.display();
        sc.close();

    }
}
