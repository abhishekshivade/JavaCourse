package controlstatement;

public class MaxNo {
    public static void main(String[] args){
        int x=15, y=20, z=12;
        /*if(x>y){
            if (x>z){
                System.out.println(x+" is max");
            }
            else if(z>y){
                System.out.println(z+" is max");
            }
        }
        else{
            System.out.println(y+" is max");
        }*/

        if (x>y && x>z){
            System.out.println(x+" is max");
        }
        else if (y>x && y>z){
            System.out.println(y+" is max");
        }
        else if (z>y && z>x){
            System.out.println(z+" is max");
        }
    }
}
