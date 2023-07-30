package design.strategy;

public class FlatDiscount implements DiscountStrategy{
    @Override
    public void giveDiscount() {
        System.out.println("Flat discount");
    }
}
