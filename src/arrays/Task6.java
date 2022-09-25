package arrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] days={"Monday","Tuesday","Wednsday","Thursday","Friday","Saturday","Sunday"};
        String[] reverseDay=new String[days.length];
        int i=0;
        for (String day:days ) {
            String reserve="";
            for (int index=0;index<day.length(); index++){
                reserve=reserve+day.charAt(day.length()-1-index);
            }

            System.out.println(reserve);
reverseDay[i]=reserve;
i++;

        }
        System.out.println(Arrays.toString(reverseDay));
    }
}
