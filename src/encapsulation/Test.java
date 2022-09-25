package encapsulation;

public class Test {
    public static void main(String[] args) {
        City city=new City();
        city.setName("Chicago");
        System.out.println(city.getName());

city.setPopulation(1233654);
city.setState("IL");
        System.out.println(city.getPopulation());
        System.out.println(city.getState());
        City city1=new City();
        System.out.println(city1.getName());
city.language="Chinese";
        System.out.println(city1.language);
        city.zipCode=111;
        System.out.println(city.zipCode);
        System.out.println(city1.zipCode);

        System.out.println(city.getName());
        System.out.println(city1.getName());


    }
}
