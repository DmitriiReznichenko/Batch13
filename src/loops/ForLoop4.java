package loops;

public class ForLoop4 {
    public static void main(String[] args) {
        String str="Phone";
        for (int i=str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
