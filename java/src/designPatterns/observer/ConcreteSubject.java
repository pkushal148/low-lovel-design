package designPatterns.observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    private int data;
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer Added");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    void newUpdate(int data) {
        this.data = data;
        notifyObservers();
    }
}
