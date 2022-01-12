package excersice.operator;

public class Excersice {

    static int val(){
        int x=20;
        int y=15;
        int z=4;
        return x++ + --y - ++z;
    }

    static int val1(){
        int x=10;
        int y=8;
        int z=5;
        return val() + ++z - ++x + --y + ~x - z%2 + y;

    }

    static int val2(){
        int x=2;
        int y=6;
        int z=7;
        return val() - val1() - -~x - z%2 + y;

    }

    static void display(){
        int x = 13;
        int y = 4;
        boolean flag = false;
        //boolean flag;
        boolean flag1 = !flag;
        System.out.println("~X = "+ ~x);
        System.out.println("~Y = "+ ~y);
        System.out.println("~~X= "+ ~~x);
        System.out.println("-~~X= "+ -~~x);
        System.out.println("-~Y = "+ -~y);
        System.out.println("Flag = "+ flag1);


    }

    public static void main(String[] args){
        System.out.println("val = "+ val());
        System.out.println("val1= "+ val1());
        System.out.println("val2= "+ val2());
        display();
    }
}
