package abstraction_excersice;

public class Math extends Student{
    @Override
    void Subject_Name() {
        System.out.print("Math = ");
    }

    @Override
    int getMarks() {
        return 50;
    }
}
