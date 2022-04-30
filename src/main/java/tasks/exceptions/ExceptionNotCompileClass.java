package tasks.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionNotCompileClass {

    public static void main(String[] args) {
        try {
            foo();
        } catch (IOException e) {
            e.printStackTrace();
        } /*catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
    }

    public static void foo() throws IOException, FileNotFoundException {
        System.out.println("Exception!");
    }
}
