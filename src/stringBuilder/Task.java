package stringBuilder;

public class Task {
    public static void main(String[] args) {

        for (char c='a';c<='z';c++){
            System.out.print(c+",");
        }
        String a="";
        for (char c='A';c<='Z';c++){
            a=a+c;
        }
        System.out.println(a);

    }
}
