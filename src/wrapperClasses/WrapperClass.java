package wrapperClasses;

/**
 *
 * It provides functionality to convert primitive data types in to objects and vice versa
 *
 * why we use?
 * 1. Primitive data types are not objects,
 * and they do not belong to any class
 * since java is object-oriented language,
 * so we used wrapper class
 *
 * */

public class WrapperClass {
    public static void main(String[] args) {
        int a = 50;

        System.out.println("a = "+a);

        Integer i = 30;     //  Integer i = new Integer(30);

        System.out.println("i = "+i);

        i = Integer.valueOf(a); //autoboxing
        //i = a;

        System.out.println("a = "+a);
        System.out.println("i = "+i);


        a = 10;

        System.out.println("a = "+a);

         i = 30;     //  Integer i = new Integer(30);

        System.out.println("i = "+i);

        i = Integer.valueOf(a); //autoboxing


        System.out.println("a = "+a);
        System.out.println("i = "+i);
    }
}
