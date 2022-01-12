package interfacedemo;

public class Car implements Vehicle, Bank {

    private int speed = 100;

    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;

    }

    @Override
    public void display(){
        System.out.println("Speed is "+speed);
    }

    @Override
    public int loan() {
        return 250000;
    }
}
