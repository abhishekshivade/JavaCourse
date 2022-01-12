package operator;
/**
 * 1. Arithmetic
 * 2. Relational
 * 3. Unary
 * 4. Shift
 * 5. Bitwise
 * 6. Ternary
 * 7. Logical
 * 8. Assignment
 * */
public class Operator {
    public static void main(String[] args){
        int a = 10, b = 12;
        System.out.println("Relational Operator");
        System.out.println(a>b); //false
        System.out.println(a<b); //true
        System.out.println(a<=b); //true
        System.out.println(a>=b); //false
        System.out.println(a!=b); //false

        System.out.println("Unary Operator");
        System.out.println(a++); //10
        System.out.println(++a); //12
        System.out.println(a--); //12
        System.out.println(--a); //10
        System.out.println(~a); //-a-1=11

        System.out.println("Shift Operator");
        a = 10;
        System.out.println(a<<2); //10*2^2=40
        a = 10;
        System.out.println(a>>2); //10/2^2=2
        a = 10;
        //System.out.println(a<<<2); //10*2^2=40
        a = 10;
        System.out.println(a>>>2); //10/2^2=2


        System.out.println("Logical Operator");
        a = 10;
        b = 12;
        System.out.println(a>b && ++b>a); //Logical and
        System.out.println("A is "+ a+ " B is " +b );
        System.out.println(a>b & ++b>a); //Bitwise and
        System.out.println("A is "+ a+ " B is " +b );
        a = 10;
        b = 12;
        System.out.println(a>b || ++b>a); //Logical or
        System.out.println("A is "+ a+ " B is " +b );
        System.out.println(a>b | ++b>a); //Bitwise or
        System.out.println("A is "+ a+ " B is " +b );
        a = 10;
        System.out.println(a^3);

        System.out.println("Ternary Operator");
        String result;
        result = (a<b) ? "A is Small than B":"A is greater than B";
        System.out.println(result);

        System.out.println("Assignment Operator");
        a = 10;
        b = 12;
        int result1 = a+=b;
        System.out.println("a+=b is "+result1);
        a = 10;
        result1 = a%=3;
        System.out.println("a%=3 is "+result1);
        a = 10;
        result1 = a/=3;
        System.out.println("a/=3 is "+result1);
        a = 10;
        result1 = a&=b;
        System.out.println("a&=b is "+result1);
        a = 10;
        result1 = a|=b;
        System.out.println("a|=b is "+result1);
        a = 10;
        result1 = a^=3;
        System.out.println("a^=3 is "+result1);


    }
}
