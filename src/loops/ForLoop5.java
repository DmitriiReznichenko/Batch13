package loops;

public class ForLoop5 {
    public static void main(String[] args) {
        for (char letter='A'; letter<='Z'; letter++){
            if (letter=='Z'|| letter=='Q') {
                System.out.print(letter);
            } else if (letter=='W') {
                System.out.print("w-");
            } else if (letter=='L') {
                System.out.print("*L*-");
        }else {
                System.out.print(letter + "-");
            }
        }
    }
}
