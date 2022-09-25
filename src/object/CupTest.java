package object;

public class CupTest {
    public static void main(String[] args) {
        Cup cup1=new Cup(true,16,"glass");
        Cup cup2=new Cup(false,28,"paper");
        Cup cup3=new Cup(true,10,"plastic");
        System.out.println(cup1.sizeOZ+" "+cup1.materialType+" "+cup1.isClean+" "+"cup1");
        System.out.println(cup2.sizeOZ+" "+cup2.materialType+" "+cup2.isClean+" "+"cup2");
        System.out.println(cup3.sizeOZ+" "+cup3.materialType+" "+cup3.isClean+" "+"cup3");
        System.out.println(cup2.isClean);
    }
}
