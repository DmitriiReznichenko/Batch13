package homework;
import java.util.Scanner;
public class SumOf1 {
    public static void main(String[] args) {
        System.out.println("Enter number of terms of series :");
        int n = new Scanner(System.in).nextInt();
        // Please don't change anything on lines above.
        float sum=0f;
for (int i=1;i<=n;i++){


    sum +=(float) 1/i;
}
        System.out.println(sum);
    }
}
