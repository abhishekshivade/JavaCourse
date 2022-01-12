package excersice.shapeByInterface;

import java.util.Scanner;

public class Square implements Shape {

    Scanner sc = new Scanner(System.in);

    @Override
    public int calculateArea() {

        System.out.println("Enter Side of Square");
        int side = sc.nextInt();

        return side*side;
    }

    @Override
    public void display() {
        System.out.println("Area of Square = "+calculateArea());
        System.out.println();
    }



}
