package object;

import java.time.LocalDateTime;
import java.util.Random;

public class Emploee {
    String id;
    String name;
    String department;
    String city;
    int age;
    public Emploee(String name,String department, String city,int age){

        Random random=new Random();
        random.nextInt(1000);
     //   LocalDateTime.now();
        this.id=""+random.nextInt(1000);
        this.age=age;
        this.city=city;
        this.department=department;
        this.name=name;

    }
    public void departmentChecker(){
        if (department.equalsIgnoreCase("IT")){
            System.out.println("Are you SDET?");
        }
    }
}
