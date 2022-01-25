package string;
/**
 *
 * Can we create custom immutable class?
 *  Yes, steps are -
 *  1. Class should be final
 *      (can't override and overwrite methods)
 *      (Can't extend the class)
 *  2. All data member must be final
 *  3. Parameterised constructor
 *  4. Should have only getter methods
 *
 *  */
public class CustomImmutable {
    final private String prn;

    public CustomImmutable(String prn){
        this.prn = prn;
    }

    public String getPrn(){
        return prn;
    }


}
