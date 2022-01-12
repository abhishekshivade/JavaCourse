package exceptionHandling;
/**
 *
 *  1.  One try block have multiple catch block and only one final block.
 *  2.  In multiple catch 1st catch block must have specific exception class and last catch block have parent exception class.
 *  3.  Try block must have either catch or finally block.
 *  4.  only One exception will be caught in a one try block.
 *  5.  instead of using specific exception class if we use parent exception class results in increase in processing time of code.
 *
 * */
public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int[] arr = {10,20,30};
            System.out.println(arr[5]);
            int a = 10/0;
        }catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("In ArrayIndexOutOfBoundsException");
        }catch (ArithmeticException ae){
            System.out.println("In ArithmeticException");
        }catch (Exception e){
            System.out.println("In Exception");
        }

    }
}
