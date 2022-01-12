package excersice.shapeByInterface;

import java.util.Scanner;

public class Circle implements Shape {

    Scanner sc = new Scanner(System.in);

    @Override
    public int calculateArea() {
        System.out.println("Enter Radius of Circle");
        int radius = sc.nextInt();

        return (22*radius*radius)/7;
    }

    @Override
    public void display() {
        System.out.println("Area of Circle is = "+calculateArea());
        System.out.println();

    }
}
