package object;

public class Cookie {
    double price;
    String flavor;
    int size;
    String shape;
    public void initializer(double price1, String flavor1, int size1,String shape1){
        price=price1;
        flavor=flavor1;
        size=size1;
        shape=shape1;

    }
public String toString(){

        return price+", "+flavor+", "+size+", "+shape;
}


    public static void main(String[] args) {
        Cookie c1=new Cookie();
        c1.initializer(.99, "chocolate", 1,"circle");
        Cookie c2=new Cookie();
        Cookie c3=new Cookie();
        Cookie c4=new Cookie();
        Cookie c5=new Cookie();
        System.out.println(c1);
        System.out.println(c2);
    }
}
