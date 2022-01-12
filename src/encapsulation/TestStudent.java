package encapsulation;

public class TestStudent {
    public static  void main(String[] args){
        Student student = new Student();
        student.setStudentName("Abhi");
        System.out.println("Student Name = "+ student.getStudentName());
        student.setRollNo(2);
        System.out.println("Roll No = "+ student.getRollNo());
        student.setPassword("987456");
    }
}
