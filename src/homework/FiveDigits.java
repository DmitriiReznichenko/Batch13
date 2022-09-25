package homework;
public class FiveDigits {
    public static void main(String[] args) {
        int num=13265, temp=num;
        int digit5=num%10; num=num/10;
        int digit4=num%10; num=num/10;
        int digit3= num%10;num=num/10;
        int digit2= num%10;num=num/10;
        int digit1= num%10;num=num/10;
        System.out.println("The number " + temp +" have 5 digits: ");
                                                                        System.out.println(digit1);
                                                                        System.out.println(digit2);
                                                                        System.out.println(digit3);
                                                                        System.out.println(digit4);
                                                                         System.out.println(digit5);
    }
}
