package excersice.shapeByInterface;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 0;

        do {

            System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Triangle");
            System.out.println("Enter your choice");
            c = sc.nextInt();

            switch (c){
                case 1:
                    Shape cr = new Circle();
                    cr.display();
                    break;

                case 2:
                    Shape re = new Rectangle();
                    re.display();
                    break;

                case 3:
                    Shape sq = new Square();
                    sq.display();
                    break;

                case 4:
                    Shape tr = new Triangle();
                    tr.display();
                    break;

                case 5:
                    System.exit(0);
                    break;
            }
        }while (c > 0 && c < 5);

        sc.close();
    }
}
