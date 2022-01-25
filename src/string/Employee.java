package string;
/**
 *
 * toString() - represent object as string
 *
 * */
public class Employee {

    private Integer eid;
    private String empName;
    private String mobileNo;
    private String emailId;
    private String address;

    public Employee(Integer eid, String empName, String mobileNo, String emailId, String address) {
        this.eid = eid;
        this.empName = empName;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.address = address;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", emailId='" + emailId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class EmployeeImpl{
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Abhi","37","gmail","Home");
        Employee e2 = new Employee(2,"Abhi1","40","yahoo","office");

        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}

/**
 *
 * class - person - full name,
 * class - doctor - first, middle, last by using split & mobile no. should be 10 digit if not throw exception
 * email id,  doctor id should be string starting with (ex DOC-001)
 * class - patient - optional id (P-101)
 * class - address - flat no, input should be integer if not throw exception
 * city,country,state (Should not have numbers)
 *  use trim(), association and aggregation
 *
 *  difference isEmpty and isBlank
 * */
