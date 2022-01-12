package abstraction_excersice;

abstract class Student {
    Student(){
        System.out.print("Marks of ");
    }
    void Subject_Name(){
        System.out.println("No Subject Found");
    }
    abstract int getMarks();
}
