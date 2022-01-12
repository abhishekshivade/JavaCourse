package encapsulation;
/**
 * By using private we hide data or encapsulate code
 * Read-Only ==> get
 * Write-Only ==> Set
 * */
public class Student {
    private int rollNo = 1;
    private String studentName = "CodeKul";
    private String password = "123456";

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
