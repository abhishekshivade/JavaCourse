package abstraction_excersice;

public class Science extends Student{
    @Override
    void Subject_Name() {
        System.out.print("Science = ");
    }

    @Override
    int getMarks() {
        return 60;
    }
}
