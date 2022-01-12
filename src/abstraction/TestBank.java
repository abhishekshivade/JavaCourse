package abstraction;

public class TestBank{
    public static void main(String[] args){
        Bank bank = new SBI();
        System.out.println("Interet is "+bank.getRateOfInterest() +" %");
        bank.getDetails();

        Bank bank1 = new HDFC();
        System.out.println("Interet is "+bank1.getRateOfInterest() +" %");
        bank1.getDetails();

        Bank bank2 = new UBI();
        System.out.println("Interest is "+bank2.getRateOfInterest()+" %");
        bank2.getDetails();
    }
}
