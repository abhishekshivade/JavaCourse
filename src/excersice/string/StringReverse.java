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
//        System.out.println(index);
        for(Integer index = 0; index <= str.length(); index++){
            System.out.print(str.charAt(index));
//            index--;
        }
    }
}
