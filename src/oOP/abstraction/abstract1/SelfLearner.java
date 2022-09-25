package oOP.abstraction.abstract1;

public abstract class SelfLearner extends Student{
    public SelfLearner(String name, int age) {
        super(name, age);
    }

    public void study(){
        System.out.println("Self Learner is studing");
    }
    public abstract void goToLibrary();

    private void party(){
        System.out.println("\"Self Learner party time");
    }
}
