public class interview {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i<=4;i++){
            for (int l = 0;l<i;l++) {
                System.out.print(" ");
            }
            j=i+1;
            for (int k = 1; k<=4; k++){
                if(j<=4){
                System.out.print(j);
                }
                j++;
            }
            System.out.println();
        }
    }
}
