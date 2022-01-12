package excersice.Test20Dec;

import java.util.Scanner;

public class Manager extends Employee {
    private long bonus;
//    long max_salary;


    public Manager() {
    }

    public Manager(int id, String name, String department, long salary, long bonus) {
        super(id,name,department,salary);
        this.bonus = bonus;
    }

    void display() {
        super.display();
        System.out.println("Bonus        : " + bonus);
        System.out.println("Total Salary : "+calculateSalary());
    }

   void accept(){
       Scanner sc = new Scanner(System.in);
        super.accept();
       System.out.println("Enter Employee Bonus");
       bonus = sc.nextLong();
//       max_salary = bonus +super.temp;
   }

   long calculateSalary(){
        return super.getSalary + bonus;
   }
}
