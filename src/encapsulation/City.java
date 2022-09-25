package encapsulation;

public class City {
    private static String name;
    private long population;
    private String state;
String language;
static int zipCode;


    public void setName(String name){
        this.name=name;

    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getName(){
        return name;
    }
    public String getState(){
        return state;
    }

    public long getPopulation() {
        return population;
    }
}
