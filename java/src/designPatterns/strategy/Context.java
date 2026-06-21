package designPatterns.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy s)
    {
        this.strategy=s;
    }

    void setStrategy(Strategy x)
    {
        System.out.println("Context strategy Switched");
        this.strategy=x;
    }

    void execute(Data data)
    {
        int ans=strategy.execute(data);
        System.out.println("ans = " + ans);
    }

}
