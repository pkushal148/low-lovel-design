package designPatterns.strategy;

public class Demo {

    public static void main(String[] args) {
        Data data=new Data(10);
        ConcreteStrategy1 concreteStrategy1 = new ConcreteStrategy1(200);
        ConcreteStrategy2 concreteStrategy2 = new ConcreteStrategy2(300);
        Context context = new Context(concreteStrategy1);

        context.execute(data);

        context.setStrategy(concreteStrategy2);

        context.execute(data);
    }
}
