package excersice.string;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        abc(str);
        sc.close();
    }

    static void abc(String str){
//        Integer index = str.length();
//        System.out.println("abc");
        for(Integer index = str.length()-1; index >= 0; index--){
//            System.out.println("for loop");
            System.out.print(str.charAt(index));
//            index--;
        }
    }
}
