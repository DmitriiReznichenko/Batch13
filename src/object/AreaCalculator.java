package object;

public class AreaCalculator {
    public void areacalculator(int lenght){
        int areaOfSquare=lenght*lenght;
        System.out.println("Area of square is : "+areaOfSquare);
    }




    public int areacalculator(int lenght,int width){
        int areaOfRectangle=lenght*width;
        System.out.println("Area of rectangle is : "+areaOfRectangle);
        return areaOfRectangle;
    }

}
