package controlstatement;

public class DivisibleBy {
    public static void main(String[] args){
        int x=15;
        if (x%3==0 && x%5==0)
            System.out.println(x+" is divisible by 3 & 5");
        else if (x%3==0)
            System.out.println(x+" is divisible by 3 only");
        else if(x%5==0)
            System.out.println(x+"10 is divisible by 5 only");
        else
            System.out.println(x+" is not divisible by 3 & 5");
    }
}
