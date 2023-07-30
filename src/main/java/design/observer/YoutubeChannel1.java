package design.observer;

import java.util.ArrayList;

public class YoutubeChannel1 implements  Subject{

    ArrayList<Observer> observerList;

    YoutubeChannel1(){
        observerList=new ArrayList<>();
    }

    @Override
    public void registeredObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisteredObserver(Observer o) {

        int index=observerList.indexOf(o);
        if(index>=0){
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObserver(String msg) {

        for(Observer o:observerList){
            o.update(msg);
        }
    }

    void newVideoAdded(String msg){
        notifyObserver(msg);
    }
}
