package wrapperClasses;

public class Practice1 {
    public static void main(String[] args) {
        byte bt=6;
        Byte b=new Byte(bt);

        System.out.println(b);
        Byte b1=new Byte("7");

        Integer i=new Integer(5);

        Long l=new Long(1000);
        System.out.println(l);
        Character c=new Character('C');
        System.out.println(c);
        Boolean bl=new Boolean(true);
        System.out.println(bl);

        Boolean blPrimitive=true;
        System.out.println(blPrimitive);


        Integer number=11;
        Integer number1=11;

        System.out.println(number==number1);
        System.out.println(number.equals(number1));
        Character letter='c';
        Integer num4=66;
        int num5=num4;





    }
}
