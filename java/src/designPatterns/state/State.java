package designPatterns.state;

public interface State {

    void selectItem(Context context,String name);

    void insertMoney(Context context,int money);

    void disperseItem(Context context);
}
