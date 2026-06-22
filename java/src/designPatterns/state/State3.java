package designPatterns.state;

public class State3 implements State{
    @Override
    public void selectItem(Context context, String name) {
        System.out.println("NOt allowed");
    }

    @Override
    public void insertMoney(Context context, int money) {
        System.out.println("NOt allowed");
    }

    @Override
    public void disperseItem(Context context) {
        System.out.println("Dispersed item");
        context.setState(new State1());
    }
}
