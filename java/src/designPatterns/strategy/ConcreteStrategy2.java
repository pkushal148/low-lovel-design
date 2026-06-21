package designPatterns.strategy;

public class ConcreteStrategy2 implements Strategy{

    private int value;

    public ConcreteStrategy2(int x)
    {
        this.value=x;
    }

    @Override
    public int execute(Data data) {
        System.out.println("Executing CS2");
        return value;
    }
}
