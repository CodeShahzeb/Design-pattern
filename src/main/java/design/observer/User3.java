package design.observer;


public class User3 implements  Observer{
    @Override
    public void update(String msg) {
        System.out.println("User3 "+msg);
    }
}

