package design.decorator;

public class ChocoChipsDecorator extends IceCreamDecorator{

    IceCream iceCream;

    public ChocoChipsDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    String getDescription(){
        return iceCream.getDescription()+ " with Choco Chips ";
    }

    @Override
    int cost() {
        return iceCream.cost()+25;
    }
}
