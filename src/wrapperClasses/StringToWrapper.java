package wrapperClasses;

public class StringToWrapper {
    public static void main(String[] args) {
        String str="17.5";
        Float number=Float.valueOf(str);
        float num=Float.valueOf(str);

        System.out.println(number+10);

        float number1=Float.parseFloat(str);

        Float number2=Float.parseFloat(str);
    }
}
