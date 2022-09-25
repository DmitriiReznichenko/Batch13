package groupProject0613;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the integer number");
        int userNumber=scanner.nextInt();
        boolean t=false;
        for (int i=2;i<userNumber; i++) {
            if ((userNumber % i) == 0) {
                t = true;
                break;
            }
        }
        if((userNumber>=-1)&&(userNumber<=1)){
            System.out.println("it is not a prime number");        }
        else if(!t){
            System.out.println("it is a prime number");
        }else{
            System.out.println("it is not a prime number");
        }
    }
}
