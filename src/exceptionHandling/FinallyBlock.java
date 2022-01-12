package exceptionHandling;
/**
 *
 *finally block executed always even exception is occurred or not
 *
 * we can use try and finally block without catch block
 *
 * if exception is not caught (Catch block is not given) is does not execute code after finally block
 *
 * if exception is caught (Catch block is given) is does execute code after finally block
 *
 * if exception is not occurred (Catch block given or not given) is executes code after finally block
 *
 * */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyBlock {
    public static void main(String[] args) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("ExceptionHandling.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            //  closes the connection
        }
    }
}
