package arrays;

public class CharTask {
    public static void main(String[] args) {
        char[] ch={'B','Y','6','w','3','&','!','d'};
        for (char numbers: ch     ) {
            if (numbers>='0' && numbers <='9'){
                System.out.println(numbers);
            }

        }
        for (char numbers:ch             ) {
            if (Character.isDigit(numbers)){
                System.out.println(numbers);
            } else if (Character.isAlphabetic(numbers)) {
                System.out.println(numbers);


            }else System.out.println(numbers);

        }
    }
}
