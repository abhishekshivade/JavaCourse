package excersice.shape;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        do {
            System.out.println("1. Triangle\n2. Square\n3. Rectangle\n4. Circle\n5. Exit");
            System.out.println("Entre Your Choice");
            c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.println("Entre Base of a Triangle");
                    int base = sc.nextInt();
                    System.out.println("Entre Height of a Triangle");
                    int height = sc.nextInt();
                    Shape tr = new Triangle(base, height);
                    System.out.println("Area of a Triangle = " + tr.calculateArea());
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Entre Side of a Square");
                    int side = sc.nextInt();
                    Shape sq = new Square(side);
                    System.out.println("Area of a Square = " + sq.calculateArea());
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Entre Width of a Rectangle");
                    int width = sc.nextInt();
                    System.out.println("Entre Height of a Rectangle");
                    int height1 = sc.nextInt();
                    Shape rect = new Rectangle(width,height1);
                    System.out.println("Area of a Rectangle = "+rect.calculateArea());
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Entre Radius of a Circle");
                    int radius = sc.nextInt();
                    Shape cr = new Circle(radius);
                    System.out.println("Area of a Circle = "+cr.calculateArea());
                    System.out.println();
                    break;

                case 5:
                    System.exit(0);
                    break;

            }
        }while (0<c || c>5);
    }
}
