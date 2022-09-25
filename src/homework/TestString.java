package homework;

public class TestString {
    public static void main(String[] args) {
       String str="java";
       str.indexOf("a");
        str.indexOf("va");
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("va"));
        str.replace('a','b');
        System.out.println(str);
        System.out.println(str.replace('a','b'));
        str.contains("ava");
        System.out.println("java".contains("t"));
        String second=" coding";
        System.out.println(str.equals(second));
        System.out.println(str.concat(second));
        System.out.println(str.startsWith("j"));
        System.out.println(str.endsWith("a"));

    }
}
