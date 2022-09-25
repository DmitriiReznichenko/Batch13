package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many names do you want to store in an array?");
        int numberOfnames=scanner.nextInt();
        scanner.nextLine();

        String[] names=new String[numberOfnames];
        String[] longNames=new String[numberOfnames];
        String[] shortNames=new String[numberOfnames];


        for ( int i=0;i<numberOfnames;i++ ){
                    System.out.println("Please enter name "+(i+1));

                  //  names[i]=scanner.nextLine();
            String name=scanner.nextLine();
            names[i]=name;

                    if (name.length()>=5){
                        longNames[i]=name;
                    }else {
                        shortNames[i] = name;
                    }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));
        System.out.println(Arrays.toString(names));

     //   for (int i=0; i<names.length;i++ ){
     //       System.out.println(names[i]);
        //}

    }
}
