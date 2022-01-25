package string;
/**
 *Immutable ==> Value get updated but old value remains as it is in an SPC.
 * Mutable ==> Value get updated but old value get deleted.
 *
 * Primitive data types are mutable.
 * non- primitive data types are immutable. (all wrapper classes)
 *
 *
 * */
public class Immutable {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        n1 = 50;
        String s1 = "Mumbai";
        System.out.println(s1);//mumbai
        String s2 = "Mumbai";
        System.out.println(s2);//mumbai
        s1 = "Pune";
        System.out.println(s1);//pune
        s1.concat("123"); //new value pune123  created but still s1 object point to pune
        System.out.println(s1);//pune
        String s3 = s1.concat("123");
        System.out.println(s3);//pune123
    }
}
