package wrapperClasses;
/**
 *
 * wrapper class to primitive data type
 *
 * */
public class Unboxing {
    public static void main(String[] args) {
        Integer i = 60;

        int a;

        //a = i.intValue();
        a = i;

        System.out.println("i = "+i);
        System.out.println("a = "+a);
    }
}
