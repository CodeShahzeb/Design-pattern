package design.strategy;

public class ApplyDiscount {

    DiscountStrategy discountStrategy;

    public ApplyDiscount(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;

    }

    void getDiscount(){
        discountStrategy.giveDiscount();
    }

    void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }
}
