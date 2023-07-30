package design.abstractFactory;

public class OnePlusFactory extends  PhoneStore{
    @Override
    Phone createPhone(String modelName) {
        if(modelName.equals("Oneplus8")){
            return new OnePlus8();
        }

        else if(modelName.equals("Oneplus9")){
            return new OnePlus9();
        }
        return null;
    }
}
