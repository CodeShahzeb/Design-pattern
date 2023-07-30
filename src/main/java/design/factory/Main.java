package design.factory;

public class Main {
    public static void main(String[] args) {
        MobileFactory mobileFactory=new MobileFactory();
        Mobile mobile= mobileFactory.createMobile("IPHONE");
        mobile.createMobile();

        mobile= mobileFactory.createMobile("ONEPLUS");
        mobile.createMobile();


        mobile= mobileFactory.createMobile("REALME");
        mobile.createMobile();




    }
}
