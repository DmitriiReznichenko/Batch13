package stringBuilder;

public class Task2 {

    public static void sumOfNumbers(StringBuilder stringBuilder){
        int sum=0;
        for (int i=0;i<stringBuilder.length();i++){
            if (Character.isDigit(stringBuilder.charAt(i)))        {
              //  sum+=Integer.parseInt(""+stringBuilder.charAt(i));
                sum+=Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));
            }

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        StringBuilder b=new StringBuilder("dfaWE+-2-l&^--4[+5");
        sumOfNumbers(b);
    }
}

