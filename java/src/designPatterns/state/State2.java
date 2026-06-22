package designPatterns.state;

public class State2 implements State{

    @Override
    public void selectItem(Context context, String name) {
        System.out.println("NOt allowed");
    }

    @Override
    public void insertMoney(Context context, int money) {
        System.out.println("context = " + context + ", money = " + money);
        context.setState(new State3());
    }

    @Override
    public void disperseItem(Context context) {
        System.out.println("NOt allowed");
    }
}
