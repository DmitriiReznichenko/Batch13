package stringBuilder;

public class Practice {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();

        StringBuilder builder1=new StringBuilder("Test");
        StringBuilder builder2=new StringBuilder();
        builder2.append("Saturday");
        System.out.println(builder);
        System.out.println(builder1);
        System.out.println(builder2);
    }
}
