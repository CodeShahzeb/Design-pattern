package design.factory;

public class MobileFactory {


    public Mobile createMobile(String companyName){

        if(companyName==null || companyName.isEmpty()){
            return null;
        }
        else if(MobileEnum.IPHONE.name().equals(companyName)){
              return new Iphone();
        }
        else if(MobileEnum.ONEPLUS.name().equals(companyName)){
             return new OnePlusPhone();
        }
        else if(MobileEnum.REALME.name().equals(companyName)){
             return new RealMe();
        }
        else{
            return null;
        }

    }
}
