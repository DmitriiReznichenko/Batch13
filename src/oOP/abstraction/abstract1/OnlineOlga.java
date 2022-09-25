package oOP.abstraction.abstract1;

public class OnlineOlga extends OnlineStudent {
    String hobbies;

    public void quastions(int numberOfQuastion){
        System.out.println("Olga is asking " + numberOfQuastion+" quastions");
    }
    public Integer watch(String day){
        System.out.println("Olga is watching more to learn more");
        return 8;
    }

}
