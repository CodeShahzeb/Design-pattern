package design.factory;

public class RealMe implements  Mobile{
    @Override
    public void createMobile() {
        System.out.println("Creating Realme Mobile Phone");
    }
}
