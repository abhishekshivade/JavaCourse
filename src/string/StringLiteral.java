package string;
/**
 *
 *
 *
 * */
public class StringLiteral {

    public static void main(String[] args) {
        String str1 = "CodeKul";
        String str2 = "CodeKul";
//        String str3 = new String("CodeKul");
        String str3 = new String("Pune");
        String str4 = new String("Pune");

/**     == checks pointing to same objects or not  */

        System.out.println("Str1 and str2");
        if (str1 == str2){
            System.out.println("Pointing same object");
        }
        else {

            System.out.println("Not Pointing same object");
        }


        System.out.println("Str1 and str3");

        if (str1 == str3){
            System.out.println("Pointing same object");
        }
        else {

            System.out.println("Not Pointing same object");
        }

        System.out.println("Str3 and str4");

        if (str3 == str4){
            System.out.println("Pointing same object");
        }
        else {

            System.out.println("Not Pointing same object");
        }

    }
}
