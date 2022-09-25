package loops;

public class ForEachPractice {
    public static void main(String[] args) {
        String[] cities={"Antananarivu","Chicago","Springfield","Denver","New York"};
        for (String city: cities){
            System.out.println(city);
        }
        System.out.println("*************************");

        int[] numbers={4,5,6,78,9};
        int sum=0;
        for (int num:numbers             ) {
            sum=sum+num;
            System.out.println(sum);
        }
    }

}
