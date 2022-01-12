package controlstatement;

public class WhileLoop {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,7,8,9,10};
        int i = 0, sum = 0;
        while (i<10){
            sum += a[i];
            i++;
        }

        System.out.println("SUM = "+sum);
    }
}
//take 2 nos from user and 2nd is power of 1st no