package keywords;

public class ReturnKeyWord {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println(add(x,y));
    }

    static int add(int x, int y){
        return x+y;
    }
}