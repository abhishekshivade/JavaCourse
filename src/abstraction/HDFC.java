package abstraction;

public class HDFC extends Bank{
    @Override
    int getRateOfInterest() {
        return 8;
    }

    @Override
    void getDetails() {
        //super.getDetails();
        System.out.println("HDFC Details");
    }
}
