package constrouctor;
/**
 * 1. Name of constructor is same a class name
 * 2. It does not have return type so, it does not return anything
 * 3. You can specify access specifier to constructor
 * 4. Constructor can not be Abstract, Synchronised, Static, Final
 * 5. Constructor can be overLoad can not be overRide
 * 6. Types of Constructor ==> 1. Default
 *                             2. Parametrised
 * */
public class Person {
    private int id;
    private String name;

    Person(){
        System.out.println("In Constructor");
    }
/**
 * Parameter Id is same use this.id
 * */
//    Person(int id){
//        this.id = id;
//    }

    /**
     * Parameter Id is not same do not use this.id
     * */
    Person(int i){
        id = i;
    }

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args){
        System.out.println("Before Object creation");
        Person person = new Person(2,"abc");
        Person person1 = new Person(3);
        //Person person1 = new Person(4);
        System.out.println("After Object creation");
        System.out.println("ID = "+person.id);
        System.out.println("Name = "+person.name);
       // System.out.println("Id with this. = "+person1.id);
        System.out.println("Id without this. = "+person1.id);
    }

}
