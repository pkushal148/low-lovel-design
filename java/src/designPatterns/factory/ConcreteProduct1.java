package designPatterns.factory;

public class ConcreteProduct1 implements Product{
    @Override
    public void performAction() {
        System.out.println("action performed at 1");
    }
}
