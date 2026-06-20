package designPatterns.observer;

public class Demo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver1 o1 = new ConcreteObserver1();
        ConcreteObserver2 o2= new ConcreteObserver2();

        subject.registerObserver(o1);
        subject.registerObserver(o2);

        subject.newUpdate(20);

        ConcreteObserver1 o3=new ConcreteObserver1();
        subject.registerObserver(o3);
        subject.newUpdate(30);
        subject.removeObserver(o2);
    }
}
