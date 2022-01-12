package array;
/**
 * Array==> is a collection of homogeneous (with same datatype) element
 * contiguous memory allocation
 * syntax ==> dataType variableName[] = new dataType[size];
 * */
public class SimpleOneDArray {
    public static void main(String[] args) {
        int arr[];// Declaration
        arr = new int[5];// Instantiation or creation

        arr[0] = 1;
        arr[1] = 2;
       // arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
       // System.out.println(arr[5]); //shows Exception error out of memory
        System.out.println(arr.length); //print length
        System.out.println(arr);//print address

        String[] names = new String[2];

        names[0] = "A";
        //names[1] = "B";

        System.out.println(names[0]);
        System.out.println(names[1]);

        String empName[] = {"C","D"};
        System.out.println(empName[0]);
        System.out.println(empName[1]);
    }
}
