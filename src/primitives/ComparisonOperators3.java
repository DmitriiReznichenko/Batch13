package primitives;

public class ComparisonOperators3 {

    public static void main(String[] args) {
        /*
        event, if the child's age is less then 7, they can attend
         */
        int kAge=1;
        int rAge=7;
       boolean canAttend= kAge<rAge;
        System.out.println("Can child  attend? " + canAttend);

         /*
        event, if the child's age is greater then 7, they can attend
         */

        boolean canAttend1 = kAge>rAge;
        System.out.println("Can child  attend? " + canAttend1);

        /*
        there is picnic and only kids that are at age of 14 can attend
         */
     rAge= 14;
     boolean canAttend2= kAge==rAge;
        System.out.println("is it child's age 14? "+ canAttend2);

        /*
        there is a party, they are not taking people to the party if their age is 18
         */
    rAge=18;
    boolean canAttend3 = kAge!=rAge;
        System.out.println("can attend?"+ canAttend3);
    }
}
