package design.decorator;

public abstract class IceCream {

    String description;
    String getDescription(){
        return description;
    }
    abstract int cost();
}
