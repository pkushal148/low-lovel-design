package designPatterns.strategy;

public class ConcreteStrategy1 implements Strategy{

    int value;

    public ConcreteStrategy1(int x)
    {
        this.value=x;
    }

    @Override
    public int execute(Data data) {
        System.out.println("executing CS 1");
        return data.getD1()*value;
    }
}
