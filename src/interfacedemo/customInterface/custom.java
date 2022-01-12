package interfacedemo.customInterface;

public interface custom {
    //empty
}

class Test{
    void display(){
        System.out.println("Hello...!");
    }

    void show(){
        System.out.println("Good Afternoon");
    }
}


class TestImpl{
    public static void main(String[] args) {
        Test test = new Test();
        if (test instanceof custom)
            test.display();
        else
            test.show();
    }
}