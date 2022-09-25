package loops;

public class Task1 {
    public static void main(String[] args) {
        String str="R4#y7!";
        int index= 0;
        int digits=0;
        int letters=0;
        int symbols=0;

        while (index<str.length()){
          //  if ((char1>='A' && char1<='Z') || (char1>='a'&& char1<='z')) {
            char char1=str.charAt(index);
            if ((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
                letters++;
            } else if (char1>='0' &&char1<='9'){
                digits++;
            } else {
                symbols++;
            }
            index++;
        }
        System.out.println(symbols+"symbols");
        System.out.println(digits+"digits");
        System.out.println(letters+"letters");
    }
}
