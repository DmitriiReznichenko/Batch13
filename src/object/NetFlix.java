package object;

public class NetFlix {
    String user;
    static String accountName="Family";
    Double montlyData=25D;
    public void streaming(double useAge ){
        montlyData=montlyData-useAge;
        System.out.println("After " +user+ " streamed, left over data id "+montlyData);


    }

    public static void main(String[] args) {
        NetFlix netFlix=new NetFlix();
        netFlix.user= "Kids";
        netFlix.streaming(5);
        NetFlix netFlix2=new NetFlix();
        netFlix.user="Dmitrii";
        netFlix2.streaming(12);




    }
}
