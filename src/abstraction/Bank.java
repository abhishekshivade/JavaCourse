package abstraction;
/**
 * If abstract method is defined class should be Abstract
 *
 * Object of Abstract class can not be created
 *
 * Abstract can never be instantiated
 *
 * constructor is similar to function but does not return anything
 *
 * Name of constructor is same as name of class
 *
 * To achieve 100% abstraction use interface
 *
 * */
abstract class Bank {
    Bank(){ // Default Constructor
        System.out.println("Bank Created");
    }

    abstract int getRateOfInterest();
    void getDetails(){
        System.out.println("Bank Details");
    }
}





