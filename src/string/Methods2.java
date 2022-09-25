package string;

public class Methods2 {
    public static void main(String[] args) {
        String city="windy city is chicago";
        int num1=city.indexOf('h');
        System.out.println(num1);
        System.out.println(city.indexOf('c'));
        int num2=city.indexOf('c',1);
        System.out.println("second matching 'c:" + num2);
        int num3=city.indexOf('c', city.indexOf('c')+1);
        System.out.println("second matching 'c' with dynamic: "+num3);
        int num4=city.indexOf('x');
        System.out.println(num4);
        System.out.println(city.indexOf('c',120));
        System.out.println(city.indexOf("go"));
        System.out.println( city.indexOf('g')== city.indexOf("go"));
        System.out.println(city.indexOf("city"));

    }
}
