package primitives;

public class TrueTableTask {
    public static void main(String[] args) {


        double exam1= 69.5, exam2= 86.7, exam3= 54.9;
        boolean avScore= ((exam1+exam2+exam3)/3)>=70;
        double participationRate = 82;
        boolean participationRate1 = participationRate >=80;
        double homeWork = 91;
        boolean homeWork1 = homeWork >=90;
        System.out.println("can user pass the course ? "+ (avScore && participationRate1 && homeWork1));


        int b=4,c=2;
        boolean result= b+2 == 3*c || !true && c < b/3 ;
        System.out.println(result);
    }

}
