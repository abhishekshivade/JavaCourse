package keywords.statickeyword;

public class Employee {
    private int empId;
    private String eName;
    final private String cName = "CodeKul";

    public Employee(int empId, String eName){
        this.empId = empId;
        this.eName = eName;
    }

    void show(){
        System.out.println("EmpId = "+empId+" EmpName = "+eName+" Company Name = "+cName);
    }

    public static void main(String[] args){
        Employee emp1 = new Employee(1, "emp1");
        //Employee.cName ="WA";
        emp1.show();
        Employee emp2 = new Employee(2, "emp2");
//        Employee.cName = "FB";
//        emp1.show();
        emp2.show();
    }
}
