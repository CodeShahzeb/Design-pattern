package design.singleton;

public class SingletonCls {

    private static SingletonCls obj;

    private SingletonCls(){

    }

    public static  SingletonCls getInstance() {
        if (obj == null) {
          synchronized (SingletonCls.class) {
              if (null == obj) {
                  obj = new SingletonCls();
              }
          }
        }
        return obj;
    }
}
