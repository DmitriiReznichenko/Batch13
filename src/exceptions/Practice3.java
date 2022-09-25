package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.SocketException;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args)throws FileNotFoundException /*throws FileNotFoundException, SocketException*/ {
        try {
            FileInputStream stream=new FileInputStream("Testr");
            Scanner scanner=new Scanner(stream);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine ());
            }
        } catch (FileNotFoundException e) {
            System.out.println("This is a type of IOException");

            System.out.println(e.getCause());
            System.out.println(e.getMessage() );
            System.out.println(e.getStackTrace());
            System.out.println(e.toString() );
       }
//you can handle exceptions in two different ways:
        //-1. by using try catch blick
        //-2.by using 'throws' keyword to include the exception in the method signature


    }
}
