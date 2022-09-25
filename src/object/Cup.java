package object;

public class Cup {
    boolean isClean;
    int sizeOZ;
    int count;
    String materialType;
    public boolean isClean(){
        System.out.println("This is  isclean method");
        return isClean;
    }
   public Cup(int sizeOZ) {
        this.sizeOZ = sizeOZ;
    }
    /*public Cup(int count) {
        this.count = count;
    }*/

    public Cup(boolean isClean,int sizeOZ, String materialType){
        this.isClean=isClean;
        this.sizeOZ=sizeOZ;
        this.materialType=materialType;



    }
    public Cup(){
        this(true,5,"wood");
    }
}
