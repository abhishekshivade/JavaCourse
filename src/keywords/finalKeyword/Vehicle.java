package keywords.finalKeyword;

/** final method    */

public class Vehicle {
    final void run(){
        System.out.println("Running");
    }
}

class TwoWheeler extends Vehicle{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
    }
}
