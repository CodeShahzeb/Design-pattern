package design.factory;

public class Iphone implements  Mobile{

    @Override
    public void createMobile() {
        System.out.println("Creating Iphone Mobile Phone");
    }
}
