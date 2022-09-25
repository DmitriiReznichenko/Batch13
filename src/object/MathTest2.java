package object;

public class MathTest2 {
    public static void main(String[] args) {
        Math2 math2=new Math2();
      // int sum1 =math2.sumCalculator1(2,3);
       int sum2= math2.SumCalculator2(2,3);
        double result1=100+sum2*25-1;
        System.out.println("Result1 is "+result1);
        double result2= 30+ math2.SumCalculator2(1,1);
        System.out.println(result2);
        String x=math2.sumcalculator3(100,100);

        System.out.println(math2.sumcalculator3(100,100));
        System.out.println(x);
        System.out.println(x.equals(math2.sumcalculator3(100,100)));
        String myName=math2.fullname("Dmitrii", "Reznicenko");
        Math2 person=new Math2();
        person.fullname("dsff","sfdf");
        System.out.println(myName.concat("@gmail".toUpperCase()));
    }


}
