package arrayList;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        Car car1=new Car("BMW","X6","red",2015);
        Car car2=new Car("Toyota","Prius","Gold",2008);
        Car car3=new Car("Honda","Odissey","Blue",2013);
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        blueFinder(cars);

        ArrayList list=new ArrayList();
        list.add("Dima");
        list.add(car1);
        Integer[] numbers={1,2,3};
        list.add(numbers);
        System.out.println(list);
        redFinder(cars);
        ArrayList<String> states=new ArrayList<>();
        states.add("IL");
        states.add("NY");
        states.add("NJ");
        example(states);


    }
    public static void example(ArrayList example){
        for (Object o:example){
            System.out.println(o);
        }
    }
    public static void redFinder(ArrayList<Car> cars){
        for (Car car: cars){
            if (car.color.equalsIgnoreCase("red")){
                System.out.println(car.brand+" " + car.model+" "+car.year+" is red");
            }
        }
    }
    public static  void blueFinder(ArrayList<Car> cars){
        for (Car car: cars){
            if (car.color.equalsIgnoreCase("blue")){
                System.out.println(car.brand+" " + car.model+" "+car.year+" is blue");
            }
        }
    }
}
