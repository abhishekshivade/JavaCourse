package excersice.string;

import java.util.Locale;

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
 */
public class StringEx {
    public static void main(String[] args) {
        String str = "And Here is a String Exercise";

        System.out.println("str is:");
        System.out.println(str);
        System.out.println("chart at :");
        System.out.println(str.charAt(10));
        System.out.println("UPPER CASE");
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println("lower case");
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println("str length");
        System.out.println(str.length());
        System.out.println("index of");
        System.out.println(str.indexOf('s'));
        System.out.println("starts with");
        System.out.println(str.startsWith("is"));
        System.out.println("ends with");
        System.out.println(str.endsWith("cise"));
        System.out.println("replace");
        System.out.println(str.replace("a","e"));
        System.out.println("replace all");
        System.out.println(str.replaceAll("e","a"));
        System.out.println("concat");
        System.out.println(str.concat(" completed"));
        System.out.println("empty");
        System.out.println(str.isEmpty());
        System.out.println("blank");
        System.out.println(str.isBlank());
        System.out.println("substring");
        System.out.println(str.substring(3)); //begins at
        System.out.println(str.substring(5,10));// begins at and ends at
        String str1 = "Codekul,Kothrud,Pune,India";
        System.out.println("split");
        System.out.println(str1.split(","));// split ','



    }
}
