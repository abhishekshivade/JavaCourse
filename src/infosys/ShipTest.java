package infosys;

import java.util.Scanner;

public class ShipTest {
    private static Passenger p1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Passenger Name");
        String passName = sc.nextLine();
        System.out.println("Enter Age of Passenger");
        Integer passAge = sc.nextInt();
        System.out.println("Enter Package Type (Srilanka / Chennai / Goa)");
        String packType = sc.next();
        System.out.println("Enter Number of Passenger");
        Integer noOfPass = sc.nextInt();
        System.out.println("Do you want Adventure Activity (true / false)");
        Boolean adact = sc.nextBoolean();
        System.out.println("Do you want cuisine (italian / chinese)");
        String cuisin = sc.next();

        Passenger p1 = new Passenger(passName, passAge, packType, noOfPass);
        Ship c1 = new CruiseShip(p1,adact);
        c1.calculateBill(cuisin);

        display(passName,passAge,packType,noOfPass,adact,cuisin,c1);
        sc.close();
    }

    static void display(String passName, Integer passAge, String packType, Integer noOfPass, Boolean adact, String cuisin, Ship c1){
        System.out.println("Passenger Name : "+passName);
        System.out.println("Age : "+passAge);
        System.out.println("Package Type : "+packType);
        System.out.println("Number of Passenger : "+noOfPass);
        System.out.println("Adventure Activity : "+adact);
        System.out.println("Cuisine : "+cuisin);
        System.out.println("Bill Amount : "+c1.getBillAmount());
        System.out.println("Booking Id : "+c1.getBookingId());
    }
}
