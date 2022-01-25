package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 *      Throws ==> Used to declare which exceptions can be thrown from method
 *                  mostly used for checked exception(compile time).
 *
 * */
public class ThrowsBlock {
    static void writeFile() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("abc.txt");
    }

    public static void main(String[] args) {
        try {
            ThrowsBlock.writeFile();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
