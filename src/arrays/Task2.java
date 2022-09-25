package arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] studentIds={44,67,5,21,99,-35,500};
       /* for (int i=0;i<=studentIds.length-1;i++){
            if (studentIds[i]<30)
                System.out.println(studentIds[i]);
        }*/
        int i=0;
        while (i<studentIds.length){
            if (studentIds[i]<30)
                System.out.println(studentIds[i]);
            i++;
        }
    }
}
