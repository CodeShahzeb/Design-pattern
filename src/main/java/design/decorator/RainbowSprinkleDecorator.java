package design.decorator;

public class RainbowSprinkleDecorator extends IceCreamDecorator{

    IceCream iceCream;

    public RainbowSprinkleDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    String getDescription(){
        return iceCream.description+ " with Rainbow Sprinkle ";
    }

    @Override
    int cost() {
        return iceCream.cost()+20;
    }
}
