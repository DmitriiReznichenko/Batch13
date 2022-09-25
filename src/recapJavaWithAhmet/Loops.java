package recapJavaWithAhmet;

import java.util.Scanner;

public class Loops {

/*
POSSIBLE INTERVIEW QUESTIONS:

1-Many technical interview questions they require to use loops to solve the questions.
LOOPS: It is a way to iterate(circle) the elements(values,items,variables) one by one.
in other words: is a cycle for the repetitive actions.

Types of Loops:
    1- Do while
    2- While
    3- For loop --> ** automation
    4- For Each loop -->*** automation

    DO WHILE :
    DO{
    Scanner scan = new Scanner (System.in);
    sout("press 2");
    int choice = scan.nextInt();

    }while(choice !=2)
*/
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter a word");
    String word=scanner.next();
    String reverse="";
    for (int i=word.length()-1;i>=0;i--){
        reverse=reverse+word.substring(i,1+i);

    }
    System.out.println(reverse);

    int sum=1;
    int number=1453;
    String  rev="";
    while (number!=0){
        int digit=number%10;
        sum*=digit;
        rev+=digit;
        number=number/10;

    }
    System.out.println(sum);
    System.out.println(Integer.parseInt(rev));


}

}
