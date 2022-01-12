package interfacedemo;
/**
 *
 * 100% abstraction is achieved
 *
 * loose coupling (change in one nit affect another)
 *
 * methods are implicitly abstract and private
 *
 * fields (Variables) are public static final
 *
 * only abstract methods are defined no non-abstract method
 *
 * used for multiple inheritance
 *
 * object of interface cannot be created only reference is used
 *
 * */
public interface Vehicle extends Bank {
    void applyBrakes(int decrement);
    void display();
}

