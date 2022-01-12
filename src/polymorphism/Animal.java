package polymorphism;
/**
 *
 *  Method OverRiding ==> We can write function with same function in different class
 *
 * */
public class Animal {
    public void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{

    public void sound(){
        System.out.println("Dog Sound");
    }

    public static void main(String[] args){
        Dog obj = new Dog();
        obj.sound();
    }
}
