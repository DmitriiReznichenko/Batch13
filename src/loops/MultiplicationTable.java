package loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int num1=1 ;num1<=5; num1++ ){
            if (num1==2 || num1==4) continue;
            for (int numb2=1;numb2<=10; numb2++){
                System.out.println(num1+" * "+numb2+" = " +num1*numb2);
            } System.out.println("_________________");
        }
    }
}
