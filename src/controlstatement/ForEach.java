package controlstatement;
/**
 * Syntax ==> for(int i:a)
 * */
public class ForEach {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        for (int i=0; i< a.length;i++){
            System.out.println(a[i]);
        }

        for (int i:a) {    /** for(int varName:arrayName) */
            System.out.println(i);
        }
    }
}
