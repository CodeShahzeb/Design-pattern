package design.abstractFactory;

public class IphoneFactory extends  PhoneStore{
    @Override
    Phone createPhone(String modelName) {
        if(modelName.equals("iphone12")){
            return new Iphone12();
        }

        else if(modelName.equals("iphone13")){
            return new Iphone13();
        }
        return null;
    }
}
