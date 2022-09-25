package oOP.abstraction.interface1;

public class Square implements Shape{
    int sideCount=4;
    public Number calculateArea(){

        return sideCount*sideCount;
    }
    public void getPerimetr(){
        System.out.println("Perimetr of square is "+4*4 );
    }


}
