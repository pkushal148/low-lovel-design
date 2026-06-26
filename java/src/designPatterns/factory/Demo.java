package designPatterns.factory;

public class Demo {

    public static void main(String[] args) {
        Factory factory;
        factory = new ConcreteFactory();
        factory.performAction();
        factory=new ConcreteFactory2();
        factory.performAction();
    }
}
