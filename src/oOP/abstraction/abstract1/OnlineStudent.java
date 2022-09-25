package oOP.abstraction.abstract1;

public class OnlineStudent extends Student {
    public OnlineStudent() {
        super("Alex", 21);
    }
    public void study(){

        System.out.println("Online student is studing at home");
    }

    public Integer watch(String day){
        System.out.println("Online student is watching via zoom");
        if (day.equalsIgnoreCase("weekday")){
            return 3;
        }else {
            return 4;
        }


    }

    public void eating(){
        System.out.println("Online student is eating at home");
    }


}
