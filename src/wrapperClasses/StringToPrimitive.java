package wrapperClasses;

public class StringToPrimitive {
    public static void main(String[] args) {
        String str="15";
        System.out.println(15+str);
        System.out.println(str+15);
        System.out.println(15+15+str);
        System.out.println(str+15+15);
        System.out.println(str+15*15);
        ///////////////////////////////////////
        int number=Integer.parseInt(str);
        System.out.println(number);
        System.out.println(number+15);
        System.out.println(15+number);
        System.out.println(3*number);


        String str1="11.5";
        Double deNumberObject=Double.parseDouble(str1);
        System.out.println(deNumberObject);

       // int number1=Integer.parseInt(str1);  //"11.5 is not format for int"
        //System.out.println(number1);
        String str2="A";//you cannot parse to Character
        String str3="true";
        boolean t=Boolean.parseBoolean(str3);
        System.out.println(">>>>>>>>>>"+t+"<<<<<<<<<<");
        System.out.println(t==true);
        Boolean tt =t;
        System.out.println(tt.equals(t));




    }
}
