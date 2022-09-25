package string;

public class SplitPractice3 {
    public static void main(String[] args) {
        String paragraph="Today is surarday. This is  a very nice day to study."+
                "I am learning split method. It return String array. Want to solve this quastione by myself. That could be a party. It is cool to see: How things are getting more easy";
    String[] sentences= paragraph.split("\\.");
        for (String sentence: sentences  ) {
            System.out.println(sentence.trim());

        }
String date= "06.18.2022";
        String[] birthday=date.split("\\.");
        if (birthday[0].equalsIgnoreCase("06") && birthday[1].equals("18") && birthday[2].equalsIgnoreCase("2022")){
            System.out.println("happy birthday!");
        }

    }
}
