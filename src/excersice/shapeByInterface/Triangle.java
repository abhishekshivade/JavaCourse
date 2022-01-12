package excersice.shapeByInterface;

import java.util.Scanner;

public class Triangle implements Shape {

    Scanner sc = new Scanner(System.in);

    @Override
    public int calculateArea() {


        System.out.println("Enter Base of Rectangle");
        int base = sc.nextInt();
        System.out.println("Enter Height of Rectangle");
        int height = sc.nextInt();

        return (base*height)/2;
    }

    @Override
    public void display() {
        System.out.println("Area of Triangle = "+calculateArea());
        System.out.println();
    }
}
