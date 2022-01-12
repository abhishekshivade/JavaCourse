package exceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        try{
            try{
                int[] arr = {10,20,30};
                System.out.println(arr[5]);
            }catch (Exception e){
                e.printStackTrace();
            }
            int a = 10/0;
        }catch (Exception ae){
            ae.printStackTrace();
        }
    }
}
