package stringBuilder;

public class Task3 {
    //s-e-l-e-n-i-u-m

    //StringBuilder a="s-e-l-e-n-i-u-m";
    public static void dashesRemover(StringBuilder a){

     for (int i=0;i<a.length();i++){
         if (a.charAt(i) =='-') {

              a.deleteCharAt(i);
              i--;
         }
     }
        System.out.println(a);
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("s--e-l----e-n-i-u-m");

        dashesRemover(stringBuilder);
    }

}
