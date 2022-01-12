package polymorphism;
/**
 * Polymorphism ==> Ability to take one form to many form
 *                           or
 *                   one thing have many action
 * Method OverLoading ==>
 *                     if one class have many methods with same name with different number of argument or with different types of arguments
 *
 * Advantage ==> It increases readability of the program
 * */
public class MethodOverLoading {
    public static void main(String[] args){
        MethodOverLoading obj = new MethodOverLoading();
        int k = obj.add(4,6);
        System.out.println(k);
        System.out.println(obj.add(2.3f,5));
        System.out.println(obj.add(2,3,4));
    }

    public int add(int i, int j){
        return i+j;
    }

    public float add(float i, int j){
        return i+j;
    }

    public int add(int i, int j, int k){
        return i+j+k;
    }
}
