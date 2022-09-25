package stringBuilder;

public class Task1 {
    public static void replaceMiddle(StringBuilder[] array){
       for (StringBuilder builder:array){
           if (builder.length()%2!=0){

               System.out.println(builder.replace(builder.length()/2,(builder.length()/2)+1,"*"));
           }
       }
    }
    public static void main(String[] args) {
        StringBuilder[] stringBuilder={new StringBuilder("Apple"),new StringBuilder("Orange"),new StringBuilder("Grape")};
        replaceMiddle(stringBuilder);
    }
}
