package design.factory;

public class OnePlusPhone implements  Mobile{
    @Override
    public void createMobile() {
        System.out.println("Creating Iphone Mobile");
    }
}
