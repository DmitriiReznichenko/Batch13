package groupProject;
public class Coins {    public static void main(String[] args) {
        System.out.println("Insert your coins: ");
        int quarters=9, dimes=4, nickels=3, pennies=9;
        float  valueQuarter=0.25f, valuedime=0.1f, valuenickle=0.05f, valuepennie=0.01f;
        float total$=quarters*valueQuarter+dimes*valuedime+nickels*valuenickle+pennies*valuepennie;
        System.out.println("Quarters: "+ quarters);
        System.out.println("Dimes   : "+ dimes);
        System.out.println("Nickles : "+nickels);
        System.out.println("Pennies : "+pennies);
        System.out.println("The total in dollars is $"+total$);
    }}
