package primitives;

public class DataTypes {
            public static void main(String[] args){

                /*
                byte, short, int, long,float, double, char, boolean
                 */
                byte num1 = 127;
                byte num2 = -128;
                // byte num3 = 200; byte data type can only store in range of -128 to 127

                short num3 = 4;
                System.out.println("This is num3 before reassigning: " +num3 ); //4
                // num1 = num3; you cannot store short data type to the byte data type

                num3 =num1 ;
                System.out.println("This is num3:" +num3); //this is  num3: 127

                int num4 = num1 + 5 + num3;
                System.out.println(num4);

                long num5 = 3;

                long num6 = 4545454545552511254L;
                //==================================

                float num7 = 2.3f;

                float num9 = 2; //2.0
                System.out.println("num9 which is floating number as 2>> " +num9);
                double num8 = 7; // 7.0
                System.out.println("num8: " +num8);

                double num10 = 6.7;

                System.out.println("This is num10>> " +num10);

                // ===============================
                char letter = 'a';
                System.out.println(letter); //a

                char number = '6';
                System.out.println(number); // 6
                char symbol = '#';

                System.out.println(symbol); // #

                char num101 = 'T';
                System.out.println(num101); // T
                System.out.println(num101 + num10);






                System.out.println(Byte.MAX_VALUE);
                System.out.println(Byte.MIN_VALUE);
                System.out.println(Short.MAX_VALUE);
                System.out.println(Short.MIN_VALUE);



            }


}
