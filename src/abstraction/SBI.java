package abstraction;

public class SBI extends Bank{
    @Override
    int getRateOfInterest() {
        return 7;
    }

    @Override
    void getDetails() {
        super.getDetails();
        // System.out.println("SBI Details");
    }
}

