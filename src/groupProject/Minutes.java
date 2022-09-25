package groupProject;
public class Minutes {
    public static void main(String[] args) {
        int minutes= 54_541_515, years= minutes/525_960, days=minutes%525_960/1_440;
        System.out.println("Convertation minutes into a numbers of years and days:");
        System.out.println(minutes+ " minutes is approximately "+ years +" years and "+ days+" days.");
    }
}
