package design.abstractFactory;

public class Customer {

    public static void main(String[] args) {
        PhoneStore iphone = new IphoneFactory();
        iphone.orderPhone("iphone12");

        System.out.println();

        PhoneStore onePlus=new OnePlusFactory();
        onePlus.orderPhone("Oneplus8");
    }

}
