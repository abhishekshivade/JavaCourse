package excersice.shape1;
/**
 *  input by parameterized constructor
 * */
import java.util.Scanner;

public class AreaCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        do {
            System.out.println("1.Triangle\n2.Square\n3.Rectangle\n4.Circle");
            System.out.println("Enter Your Choice");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter Base of Triangle");
                    int base = sc.nextInt();
                    System.out.println("Enter Height of Triangle");
                    int height = sc.nextInt();
                    AreaOfShape tr = new Triangle(base, height);
                    System.out.println("Area of Triangle = " + tr.calculateArea());
                    break;

                case 2:
                    System.out.println("Enter Side of Square");
                    int side = sc.nextInt();
                    AreaOfShape sq = new Square(side);
                    System.out.println("Area of Square = " + sq.calculateArea());
                    break;

                case 3:
                    System.out.println("Enter Base of Rectangle");
                    int baser = sc.nextInt();
                    System.out.println("Enter Height of Rectangle");
                    int heightr = sc.nextInt();
                    AreaOfShape re = new Rectangle(baser, heightr);
                    System.out.println("Area of Rectangle = " + re.calculateArea());
                    break;

                case 4:
                    System.out.println("Enter radius of Circle");
                    int radius = sc.nextInt();
                    AreaOfShape cr = new Circle(radius);
                    System.out.println("Area of Square = " + cr.calculateArea());
                    break;

                case 5:
                    System.exit(0);
                    break;
            }
        } while (c > 0 && c < 5);

        sc.close();
    }
}
