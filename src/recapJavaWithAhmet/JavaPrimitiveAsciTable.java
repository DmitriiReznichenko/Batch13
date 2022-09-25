package recapJavaWithAhmet;

public class JavaPrimitiveAsciTable {
/*
    POSSIBLE INTERVIEW QUESTIONS:

    1- What is Java and what is JDK,JVM,JRE? (indian style)
    2- What do you know about JDK,JVM and JRE? (american style)

    TIPS:Before interview check the name of interviewers to make yourself
    ready for the style questions
        use keywords for answers




 1- Java is programing language: There are three pieces of Java
        -JDK--> (java development kit) which has specific libraries, and it develops the application
        -JRE-->(java runtime environment) which has libraries and set of software tools which are responsible for execution
        -JVM-->(Java virtual Machine) which is responsible for converting BYTE code to binary code

 2- PRIMITIVE DATA TYPE:

      *Whole numbers:
      -int
      -long
      -byte
      -short

      *Decimal numbers:
        -float -->f
        -double -->d

       *Condition:
       -boolean--> true or false

        short a =5;
        short b=6;
        short c=a+b-2
        sout(c)

        answer:compile time error because once you work on any primitives below int --> it will be converted into the int variable or you can cast it(example below)

 3-ASCII TABLE:
    It is a way to store all the character, symbols, alphabets, numbers ...etc. Java refers this table
    once you work on character(CHAR) primitive data type
     */


    public static void main(String[] args) {
        short a =5;
        short b=6;
        short c=  (short) (a+b-2);
        // or
        int d = a+b+2;
        System.out.println(c);


        char letter = 65;
        char letter2='g';
        int number = (char) ('g');
        System.out.println(letter);//A
        System.out.println(letter2);//g
        System.out.println(number);//103
    }
}