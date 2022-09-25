package loops;

public class ForLoop3 {
    public static void main(String[] args) {
        String str="Today is the best day to practice for  loop";

        for (int i=0; i<str.length() ; i++){
            if ((str.charAt(i)=='t')||(str.charAt(i)=='T')){
                System.out.println(str.charAt(i));
            }
        }
        int o=0;
        for (int i=0; i<str.length() ; i++){
            if (str.charAt(i)=='o'){
                o++;

            }
        }
        System.out.println("there are "+o+" letters o");
    }
}
