//package keywords.statickeyword;
///**
// * Static Block or method requires static variable
// *
// * this and super keyword are not used in static
// *
// * non-static method is not called in static function
// *
// * static method can be called in non-static function
// *
// * while class loading static block is called
// *
// * while object creation default constructor is called
// * */
//public class StaticBlock {
//    int x = 10;
//    static int y =10;
//    static {
//        x = 15;
//        y = 15;
//        System.out.println("I am static block");
//    }
//
//    static void show(){
//        x=15;
//        y=15;
//        print();
//    }
//
//    void print(){
//        x = 20;
//        y = 20;
//        show();
//    }
//
//    StaticBlock(){
//        System.out.println("I am default constructor");
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println("I am Main Function");
//
//    }
//}
