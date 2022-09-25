package oOP.abstraction.interface1;

public class Triangle implements Shape,Material {
int side1;
int base;
int side2;
int height;


   public Double calculateArea(){
       System.out.println("Calculate area of triangle");
        return (double)(height*base/2);
    }
    public void getPerimetr(){
       int peri =side1+side2+base;
        System.out.println("getting perimetr of the triangle");
    }

    @Override
    public void melt() {
        System.out.println("Melting Triangle");

    }
}
