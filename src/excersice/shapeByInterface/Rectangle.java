package excersice.shapeByInterface;

import java.util.Scanner;

public class Rectangle implements Shape {

    Scanner sc = new Scanner(System.in);

    @Override
    public int calculateArea() {

        System.out.println("Enter Base of Rectangle");
        int base = sc.nextInt();
        System.out.println("Enter Height of Rectangle");
        int height = sc.nextInt();

        return base*height;
    }

    @Override
    public void display() {
        System.out.println("Area of Rectangle = "+calculateArea());
        System.out.println();
    }
}
