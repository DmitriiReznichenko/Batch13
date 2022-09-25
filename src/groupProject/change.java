package groupProject;
public class change {
public static void main(String[] args) {
float balance=964.93f;
System.out.println("Please enter your balance: $"+balance);
int quarters=(int) (balance/0.25),dimes=(int)(balance%0.25/0.1),nickles=(int)(balance%0.25%0.1/0.05),pennies=(int)(balance%0.25%0.1%0.05/0.01);
System.out.println("$"+balance+ " will make "+ quarters+" qarters "+ dimes+" dimes "+nickles+" nickles "+ pennies+" Pennies." );
 }}
