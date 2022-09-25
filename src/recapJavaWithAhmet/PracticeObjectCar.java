package recapJavaWithAhmet;

public class PracticeObjectCar {
    protected String brand = "BWM";//directly assigned
    public int year;
    private double horsePower;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHorsePower() {//assign with the methods
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void example(String name) {
        String name1 = name;
        //  public int age; // you cannot use access modifiers
        // System.out.println(name); //No default value it will give you compile time
    }

    public static void main(String[] args) {
        PracticeObjectCar practiceObjectCar = new PracticeObjectCar();
        System.out.println(practiceObjectCar.brand);//BMW
        System.out.println(practiceObjectCar.year);//0
        practiceObjectCar.year = 2022;//assign with object
        System.out.println(practiceObjectCar.year);//2022
        System.out.println(practiceObjectCar.horsePower);//0.0
        System.out.println(practiceObjectCar.getHorsePower());//0.0
        practiceObjectCar.setHorsePower(15.5);
        System.out.println(practiceObjectCar.getHorsePower());
        practiceObjectCar.example("ahmet");
    }
}