package keywords.superKeyword.bird;

/**
 *
 * Super keyword used to invoked  (call) immediate parent class method
 *
 * */

public class Birds {

    void fly(){
        System.out.println("Birds are flying");
    }
}

class Pigeon extends Birds{
    void fly(){
        super.fly();
        System.out.println("Pigeon is flying");
    }

    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        pigeon.fly();
    }
}
