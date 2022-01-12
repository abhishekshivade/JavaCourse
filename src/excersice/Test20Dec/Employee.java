package excersice.Test20Dec;

import java.util.Scanner;

public class Employee {
    private static int id;
    private static String name;
    private static String department;
    private static long salary;
//    long temp;

    void display(){
        System.out.println("ID         : "+ id);
        System.out.println("Name       : "+ name);
        System.out.println("Department : "+ department);
        System.out.println("Salary     : "+ salary);
    }

     void accept(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Employee ID");
         id = sc.nextInt();
//         System.out.println("ID : "+ id);
         System.out.println("Enter Employee Name");
         name = sc.next();
//         System.out.println("Name : "+ name);
         System.out.println("Enter Employee Department");
         department = sc.next();
//         System.out.println("Department : "+ department);
         System.out.println("Enter Employee Salary ");
         /*temp =*/ salary = sc.nextLong();
//         System.out.println("Salary : "+ salary);
     }

    public Employee(){
        /*System.out.println("Employee");*/
    }

    public Employee(int id, String name, String department, long salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public static long getSalary() {
        return salary;
    }
}
