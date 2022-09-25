package ifStatement;

import java.util.Scanner;

public class IfPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  name of the day Monday - Sunday");
        String day = input.nextLine();
        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("it is day 1");
        }

        if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("it is day 2");
        }
        if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("it is day 3");
        }
        if (day.equalsIgnoreCase("Thurday")) {
            System.out.println("it is day 4");
        }
        if (day.equalsIgnoreCase("Friday")) {
            System.out.println("it is day 5");
        }
        if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("it is day 6");
        }
        if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("it is day 1");
        }
        if (!day.equalsIgnoreCase("Sunday") && !day.equalsIgnoreCase("Monday") && !day.equalsIgnoreCase("Tuesday")
                && !day.equalsIgnoreCase("Wednesday") && !day.equalsIgnoreCase("Thursday") && !day.equalsIgnoreCase("Friday")
                && !day.equalsIgnoreCase("Saturday")) {
            System.out.println("There is no matching day for your entry");
        }
        if (day.startsWith("M") || day.startsWith("m")) {
            System.out.println("This is Monday");
        }
        if (day.startsWith("T") || day.startsWith("t")) {
            System.out.println("This is Tuesday or Thursday");
        }
        if (day.startsWith("W") || day.startsWith("w")) {
            System.out.println("This is Wednesday");
        }
        if (day.startsWith("F") || day.startsWith("f")) {
            System.out.println("This is Friday");
        }
        if (day.startsWith("S") || day.startsWith("s")) {
            System.out.println("This is Saturday or Sunday");
        }
        char firstLatter = day.charAt(0);
        if (firstLatter == 'M' || firstLatter == 'm') {
            System.out.println("This is Monday");
        }
        if (firstLatter == 'T' || firstLatter == 't') {
            System.out.println("This is Tuesday or Thursday");
        }
        if (firstLatter == 'W' || firstLatter == 'w') {
            System.out.println("This is Wednesday");
        }
        if (firstLatter == 'F' || firstLatter == 'f') {
            System.out.println("This is Friday");
        }
        if (firstLatter == 'S' || firstLatter == 's') {
            System.out.println("This is Saturday or Sunday");
        }
    }
}