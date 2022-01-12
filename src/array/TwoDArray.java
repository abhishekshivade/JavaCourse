package array;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<2;i++){
            for (int j=0;j<2;j++){
                System.out.println("Enter No");
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }




    }
}
