package design.strategy;

public class Main {

    public static void main(String[] args) {
        ApplyDiscount applyDiscount=new ApplyDiscount(new FlatDiscount());
        applyDiscount.getDiscount();

        applyDiscount.setDiscountStrategy(new CashBackDiscount());

        applyDiscount.getDiscount();
    }
}
