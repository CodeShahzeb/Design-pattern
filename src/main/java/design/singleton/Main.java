package design.singleton;

public class Main {

    public static void main(String[] args) {
        SingletonCls obj1=SingletonCls.getInstance();
        SingletonCls obj2=SingletonCls.getInstance();

        System.out.println("Object1:"+obj1);
        System.out.println("Object2:"+obj2);
    }
}
