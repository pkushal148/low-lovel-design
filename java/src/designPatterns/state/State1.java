package designPatterns.state;

public class State1 implements State{
    @Override
    public void selectItem(Context context, String name) {
        System.out.println("Selecting Item "+name);
        context.setState(new State2());
    }

    @Override
    public void insertMoney(Context context, int money) {
        System.out.println("NOt allowed");
    }

    @Override
    public void disperseItem(Context context) {
        System.out.println("NOt allowed");
    }
}
