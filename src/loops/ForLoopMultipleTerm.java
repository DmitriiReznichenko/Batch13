package loops;

public class ForLoopMultipleTerm {
    public static void main(String[] args) {

        int a=9;
        for (a=5;a<17;a++){
            System.out.println("a is: "+a);
        }
        System.out.println("after loops a is: "+a);
for (int i=0,k=10,m=25, c=0; i<10&& k>i; k--, i++){

            System.out.println("i-> "+i);
            System.out.println("k-> "+k);
            System.out.println("m-> "+m);
    System.out.println("this loop runs " + ++c +"times");
        }
char ch='t';
double num=1.2;
int count=0;
for (double d=2.3;ch>'m'||d>=num; ch--, num++){
    System.out.println("******************");
    System.out.println(num+ "<<num");
    System.out.println(ch+" <<ch");
    count++;
}
        System.out.println(count+"count");




    }
}
