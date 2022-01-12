package controlstatement;

public class Calculator {
    public static void main(String[] args){
        int x = 12, y = 7, i;
        String s = "mod";
        switch (s){
            case "add":
                i=x+y;
                System.out.println("X + Y = "+i);
                break;

            case "sub":
                i=x-y;
                System.out.println("X - Y = "+i);
                break;

            case "mul":
                i=x*y;
                System.out.println("X * Y = "+i);
                break;

            case "div":
                i=x/y;
                System.out.println("X / Y = "+i);
                break;

            case "mod":
                i=x%y;
                System.out.println("X % Y = "+i);
                break;
        }
    }
}
