package design.strategy;

public class CoupenDiscount implements DiscountStrategy{
    @Override
    public void giveDiscount() {
        System.out.println("Coupen discount");
    }
}
