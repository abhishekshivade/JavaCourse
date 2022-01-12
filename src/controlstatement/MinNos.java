package controlstatement;

public class MinNos {
    public static void main(String[] args){
        int x=9, y=9, z=9;
        /*if(x<y){
            if (x<z){
                System.out.println(x+" is min");
            }
            else if(z<y){
                System.out.println(z+" is min");
            }
        }
        else{
            System.out.println(y+" is min");
        }*/
        if (x<=y && x<=z){
            System.out.println(x+" is min");
        }
        else if (y<=x && y<=z){
            System.out.println(y+" is min");
        }
        else if (z<=y && z<=x){
            System.out.println(z+" is min");
        }
        /*else{
            System.out.println("All are equal");
        }*/
    }

}
