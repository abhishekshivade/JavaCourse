package string;
/**
 *
 * String can be compared in 3ways
 * 1. == -->        Compare Reference of string
 * 2. .equals -->   Compare content of string & it is case sensitivity
 *    .equalsIgnoreCase --> Compare content of string & ignore case sensitivity
 * 3. compareTo --> compares values lexicographically and return integer value (checks order in dictionary)
 *                  0 --> same
 *                  1 or positive --> 1st string is greater than 2nd string
 *                  -1 or negative --> 1st string is less than 2nd string
 *
 * */
public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Pune";
        String str2 = new String("Pune");
        String str3 = "PUNE";
        String str4 = "Mumbai";
        String str5 = "Thane";
        String str6 = "null";
        String str7 = "";

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equalsIgnoreCase(str3));//true

        System.out.println(str1.compareTo(str2));//0
        System.out.println(str1.compareTo(str4));//3 (difference in character index alphabetically)
        System.out.println(str4.compareTo(str5));//-7 (difference in character index alphabetically)
        System.out.println(str5.compareTo(str6));//nullPointerException
        System.out.println(str5.compareTo(str7));//5 (greater string length)
    }
}
/**
 * charAt
 * toUpperCase
 * toLowerCase
 * isEmpty
 * concat
 * length
 * replace
 * replaceAll
 * indexOf
 * startWith
 * endsWith
 * reverse without inbuilt function
 */