package keywords.thisKeyword;

/**
 *
 *  1. To refer current class instance variables
 *  2. To invoke (call) current class method
 *  3. To invoke current class constructor
 *  4. To pass as an argument in the method
 *  5. To pass as an argument in the constructor call   // pending
 *  6. To return current class instance
 *
 * */

public class A {
    private int a;
    private String name;

    A(int a, String name){
        this();
        this.a = a;
        this.name = name;
    }

    A(){
        //this(20,"abf");
        a = 15;
        name = "dd";
        System.out.println("a = "+ a+" Name = "+name);
    }

    A(A a){
        System.out.println("This is argument in the constructor call");
    }

    void display(){
//        this.show(); //explicit call

        show(this);
        A a1 = new A(this);
    }

    A retObject(){
        return this;
    }

    void show(){
//        System.out.println(this);
        System.out.println(a);
        System.out.println(name);
    }

    void show(A a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        A t1 = new A(20,"aaa");
        A a = new A();
//        System.out.println(t1);
        t1.display();
    }
}
