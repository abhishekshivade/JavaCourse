package excersice.CustomException;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(String str){
        super(str);
    }
}
