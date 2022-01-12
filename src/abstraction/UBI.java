package abstraction;

public class UBI extends Bank{
    @Override
    int getRateOfInterest() {
        return 6;
    }

    @Override
    void getDetails() {
        //super.getDetails();
        System.out.println("UBI");
    }
}
