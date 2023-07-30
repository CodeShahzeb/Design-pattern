package design.strategy;

public class CashBackDiscount implements DiscountStrategy{
    @Override
    public void giveDiscount() {
        System.out.println("CashBack Discount");
    }
}
