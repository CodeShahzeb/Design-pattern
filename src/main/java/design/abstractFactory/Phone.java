package design.abstractFactory;

public abstract class Phone {

    String brand;
    String modelNmae;
    String bodyType;
    String phoneSize;

    void buildPhone(){
        System.out.println("Building Phone of brand :"+brand);
        System.out.println("Phone model is :"+ modelNmae);
        System.out.println("Size of Phone is "+phoneSize);
        System.out.println("Body type phone is "+bodyType);
    }

    void assemblePhone(){
        System.out.println("Assembling all parts of phone");
    }

    void packPhoneInBox(){
        System.out.println("Packing of Phone");
    }
}
