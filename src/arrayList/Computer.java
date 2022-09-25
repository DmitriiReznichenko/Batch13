package arrayList;

public class Computer {
    String brand;
    String model;
    int screenSize;
    double Price;

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", Price=" + Price +
                '}';
    }

    public Computer(String brand, String model, int screenSize, double price) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        Price = price;
    }
}
