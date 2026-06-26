package designPatterns.factory;

public class ConcreteProduct2 implements Product{
    @Override
    public void performAction() {
        System.out.println("Action performed at 2");
    }
}
