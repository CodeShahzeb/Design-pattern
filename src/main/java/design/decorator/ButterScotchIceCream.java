package design.decorator;

public class ButterScotchIceCream extends  IceCream{

    @Override
    int cost() {
        return 60;
    }

    @Override
    String getDescription(){
        return "Butter Scotch";
    }
}
