package design.decorator;

public class ChocolateIceCream extends  IceCream{

    @Override
    int cost() {
        return 70;
    }

    @Override
    String getDescription(){
        return "Chocolate";
    }
}
