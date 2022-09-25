package loops;

import java.util.Arrays;
import java.util.Locale;

public class ForEachTask {
    public static void main(String[] args) {
        String[] names={"David","John","Diana","Mustafa","Kuba","Gulistan"};
        String[] emails=new String[names.length];
        int i=0;
        for (String name: names             ) {
            System.out.println(name.toLowerCase().concat("@tectorial.com"));
            emails[i]=name.toLowerCase().concat("@tectorial.com");
            i++;


        }
        System.out.println(Arrays.toString(emails));
        for (String email:emails             ) {
            if (email.contains("mustafa")){
                System.out.println("Mustafa's email address is: "+email);

            }

        }


    }
}
