package exceptionHandling;
/**
 *
 *      Throw ==> Used explicitly throw an exception within a method
 *                  Used for custom exception
 *
 *      Throws ==> Used to declare which exceptions can be thrown from method
 *
 * */
public class ThrowBlock {
    static void m1(){
        try{
            throw new NullPointerException("Null Pointer Exception occurred");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowBlock.m1();
    }
}
