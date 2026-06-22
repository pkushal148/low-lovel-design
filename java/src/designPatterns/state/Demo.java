package designPatterns.state;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.disperseItem();
        context.selectItem("soap");
        context.insertMoney(10);
        context.disperseItem();
    }
}
