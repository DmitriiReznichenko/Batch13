package arrayList;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c1=new Computer("Apple","Pro",11,1000);
        Computer c2=new Computer("HP","Envy",15,1500);
        Computer c3=new Computer("Lenovo","ThinkPad",11,450);
        Computer c4=new Computer("Apple","Air",16,1200);


        ArrayList<Computer> items=new ArrayList<>();
        items.add(c1);
        items.add(c2);
        items.add(c3);
        items.add(c4);

        totallForComputers(items);
        compchip(items);
    }

    public static void compchip(ArrayList<Computer> comps){
        for (Computer machine : comps){
            if (machine.Price<500){
                System.out.println("Price of "+machine.brand+ " is less then $500");

            }
        }

    }
    public static void totallForComputers (ArrayList<Computer> comps) {
        int sum = 0;

        for (Computer machine : comps) {
            sum += machine.Price;
        }

        System.out.println("Total for all computers: " +sum);
    }
}
