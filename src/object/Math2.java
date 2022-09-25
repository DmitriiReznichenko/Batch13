package object;

public class Math2 {
    public void sumCalculator1(int num1,int num2){
        int total1=num1+num2;
        System.out.println("Total1 is: " +total1);
    }
    public int SumCalculator2(int num1,int num2){
        int total2=num1+num2;
        System.out.println("Total2 is: " +total2);
        return total2;
    }
    public String sumcalculator3(int num1,int num2){
        int total3=num1+num2;
        return "the total3 is:"+ total3;
    }
    public String fullname(String firstName,String lastName){
        //System.out.println(firstName+" "+lastName);
        return firstName+" "+lastName;

    }

}
