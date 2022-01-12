package abstraction_excersice;

public class TestMarks {
    public static void main(String[] args){
        Student student1 = new Math();
        student1.Subject_Name();
        System.out.println(student1.getMarks());

        Student student2 = new Science();
        student2.Subject_Name();
        System.out.println(student2.getMarks());

        Student student3 = new History();
        student3.Subject_Name();
        System.out.println(student3.getMarks());

        int p = (student1.getMarks()+student2.getMarks()+student3.getMarks())/3;
        System.out.println("Percentage = "+ p);

    }
}
