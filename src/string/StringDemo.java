package string;
/**
 *
 *  String is set of character
 *  It is sequence of character
 *  It is final class
 *  Immutable(can not change value)
 *  It implements serializable, comparable<string>, CharSequence Interface
 *
 *  There are 3 ways to create a string
 *      1. by using character array
 *          char[] ch = {'J','A','V','A'};
 *          String s = new String(ch);
 *
 *      2. String literal
 *          String str = "CodeKul";
 *          -   Stores String in an SPC.
 *          -   Object not created.
 *
 *      3. New Keyword
 *          String str = new String("CodeKul");
 *          -    Stores object in a heap memory.
 *          -   Even if string value is same it creates separate object each time.
 *
 *  String poll constant (SPC) / String Literal Pool
 *      -   Separate place in heap memory (JVM contains Stack (stores variable name and its address) & Heap Memory (SPC is inside Heap) )
 *      -   Values of strings are stored
 *      -   If string value already exists then it will point to existing memory address.
 *      -   If found new string value then it will allocate new address.
 *      -   Only object is created in a heap memory, and it refers to the string in an SPC.
 *
 *  To
 *
 */

public class StringDemo {
}
