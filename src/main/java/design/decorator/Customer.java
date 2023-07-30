package design.decorator;

public class Customer {

    public static void main(String[] args) {
        IceCream iceCream=new ButterScotchIceCream();  //Mujhe butter scotch iceCream Chahiye
        iceCream=new ChocolateSyrupDecorator(new ChocoChipsDecorator(iceCream)); // Mujhe espe cholocalate syrup karne k baad choco chips ka decorator kardiye
        print(iceCream);
    }

    static void print(IceCream iceCream){
        System.out.println("Desc: "+iceCream.getDescription());
        System.out.println("Cost: "+iceCream.cost());
    }
}
