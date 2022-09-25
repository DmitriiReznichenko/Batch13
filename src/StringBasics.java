public class StringBasics {
    public static void main(String[] args) {


        System.out.println("**Sunday**");
        String word = "Tuesday";
        System.out.println(word);
        String name = new String("David");
        System.out.println(name);
        System.out.println(word+name);
        word= name +" Souza";
        System.out.println(word);
        System.out.println("-------------");
        System.out.println(name+ " Souza");
        System.out.println(name);
        System.out.println(name +55);
        System.out.println(name + 6 +7);
        System.out.println(6+7+name);
        String result = name+ " Brown ";
        System.out.println(result);
        result += result;
        System.out.println(result);
        // String is immutable ( unchangable), unless you reassign a new value or do concatenation ( adding extra text/String to it)

        result=result + " monday";
        System.out.println(result);

        String flower = " Rose";
        System.out.println(flower);
        flower=flower.concat(" is Red");
        System.out.println(flower);

        System.out.println(flower.concat(" and beautiful"));
        System.out.println(flower);

        int number1 = 5;
        String number="1";
        number +="2";
        System.out.println(number);
        number +=2;
        System.out.println(number);
        number += true;
        System.out.println(number);

        int x = Byte.MAX_VALUE;
        System.out.println(x);


    }
}
