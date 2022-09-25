package object;

public class Pencil {
    double pencilPrice;

    public Pencil(double pencilPrice) {
        this.pencilPrice = pencilPrice;
    }
public void checkPrice(Pen pen,Pencil pencil){
        double penPrice=Double.parseDouble(pen.price);
        if (penPrice==pencil.pencilPrice){
            System.out.println("Buy it as Bundle");
        }
}
    public static void main(String[] args) {
        Pen a =new Pen("2.4");
        Pencil b=new Pencil(2.4);
b.checkPrice(a,b);




    }
}
