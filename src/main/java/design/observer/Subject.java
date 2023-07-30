package design.observer;

public interface Subject {

    void registeredObserver(Observer o);
    void unregisteredObserver(Observer o);
    void notifyObserver(String msg);
}
