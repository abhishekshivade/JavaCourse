package abstraction_excersice;

public class History extends Student{
    @Override
    void Subject_Name() {
        System.out.print("History = ");
    }

    @Override
    int getMarks() {
        return 75;
    }
}
