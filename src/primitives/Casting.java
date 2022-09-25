package primitives;

public class Casting {
    public static void main(String[] args) {
        long lg=25;
        // int1=lg; compile time error,trying to store larger data type to smaller
        System.out.println("lg>> " +lg);

        int i1=(int) lg;
        System.out.println("i1 >>"+ i1);

        long lg2= 5428754854845284574L;
        int i2= (int) lg2;
        System.out.println("i2 >>"+i2);

// from decimal to whole

        double db1=2.3;
        System.out.println("db1 >>"+ db1);
        short sh1=(short) db1;
        System.out.println("sh1 >>" +sh1);
        short sh2= (byte) db1;

        short sh3=275, sh4=800, total= (short)(sh3+sh4);
        System.out.println("total cost is: " +total);

        int i112=1265, mp=100, lmp=i112%mp;
        System.out.println("last month's payment is " +lmp);


        System.out.println(sh2);

        byte bt1= (byte) db1;
        char ch1= 'd';
        short i3=(short) ch1;
        System.out.println("i3>>" +i3);
        byte b1=4, b2=5;
        byte r1 = (byte)(b1+b2);
        System.out.println("r1 >>" +r1);
        short r2= (short) (b1+b2);
        System.out.println("r2>>"+r2);

    }

}
