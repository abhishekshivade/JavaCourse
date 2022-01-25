package excersice.CustomException;

public class SBI implements Bank{
    public double balance = 50000;
    public Integer accountNo = 123;

    @Override
    public double withdraw(double amount) {
        try {
            if (amount>balance){
                throw new InsufficientFundException("Short of Rs "+(balance - amount));
            }
            else {
                balance -= amount;
                System.out.println("Transaction Successful");
                System.out.println("Current Balance is : "+balance);
            }
        }catch (InsufficientFundException e){
            System.out.println(e.getMessage());
        }
        return balance;
    }

    @Override
    public double deposit(double amount) {
        balance += amount;
        System.out.println("Current Balance is : "+balance);
        return balance;
    }
}
