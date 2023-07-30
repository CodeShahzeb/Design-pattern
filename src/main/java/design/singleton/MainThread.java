package design.singleton;

public class MainThread {

    public static void main(String[] args) {
        Runnable1 runnable1=new Runnable1();
        Thread thread1=new Thread(runnable1);

        Runnable2 runnable2=new Runnable2();
        Thread thread2=new Thread(runnable2);

        thread1.start();
        thread2.start();
    }

}

class Runnable1 implements  Runnable{

    public void run(){
        SingletonCls obj1=SingletonCls.getInstance();
       // System.out.println("th"+obj1);

    }
}

class Runnable2 implements  Runnable{

    public void run(){
        SingletonCls obj2=SingletonCls.getInstance();
      //  System.out.println("tha"+obj2);
    }
}
