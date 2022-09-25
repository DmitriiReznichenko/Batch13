package object;

public class Math1 {
    int num1=3;
    int numb2=7;
public void sum(){
    int num1=3;
    int numb2=7;
    int sum= num1+numb2;
    System.out.println(sum+" is sum of numb 1 and numb2");
}
public void sum1(int num1, int numb2){
    int total=num1+numb2;
    System.out.println(total);
}
    public void product(double num1, double numb2){
        double product=num1*numb2;
        System.out.println(product+" is product of numb 1 and numb2");
    }
public static void main(String[] args){


    Math1 object= new Math1();
    object.sum();
    object.sum1(1,7);
    object.product(3,12);
}












}
