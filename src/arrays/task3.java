package arrays;

public class task3 {
    public static void main(String[] args) {
        int[] studentIds={-44,-67,-5,-21,-99,-35,-500};
        int largest=studentIds[0];
        int smallest=studentIds[0];
        for (int i=1;i<=studentIds.length-1;i++){
            if (studentIds[i]>largest)
                largest=studentIds[i];


        }
        System.out.println(largest);
        for (int i=1;i<=studentIds.length-1;i++){
            if (studentIds[i]<smallest)
                smallest=studentIds[i];


        }
        System.out.println(smallest);
    }
}
