package oOP.abstraction.abstract1;

public class Test {
    public static void main(String[] args) {
        OnlineStudent onlineStudent=new OnlineStudent();

        System.out.println(onlineStudent.watch("weekday"));

        System.out.println(onlineStudent.name);

        Alex alex=new Alex();
        System.out.println(alex.name);
        System.out.println(alex.age);
        OnlineOlga onlineOlga=new OnlineOlga();
        onlineOlga.eating();
        System.out.println(">>>>>>>" +onlineOlga.watch("weekend"));

      onlineOlga.quastions(5);


      OnlineStudent olga=new OnlineOlga();

        System.out.println(">>>>>>>" +olga.watch("weekend"));

Student student=new OnlineOlga();

        System.out.println(" ********" + student.watch("weekend"));






    }



}
