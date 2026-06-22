package designPatterns.state;

public class Context {
    private State state;

    public Context() {
        this.state = new State1();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void selectItem(String item)
    {
        state.selectItem(this,item);
    }

    public void insertMoney(int money)
    {
        state.insertMoney(this,money);
    }

    public void disperseItem()
    {
        state.disperseItem(this);
    }
}
