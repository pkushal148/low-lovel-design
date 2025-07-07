package vendingMachine;

import vendingMachine.MachineState.IdleState;
import vendingMachine.MachineState.State;

public class VendingMachine {
    private final static VendingMachine INSTANCE=new VendingMachine();
    private final Store store=new Store();
    private State currentState;
    private int balance=0;
    private String selectedItemCode;


    public VendingMachine() {
        currentState=new IdleState(this);
    }
    public static VendingMachine getInstance()
    {
        return INSTANCE;
    }
    public void insertCoin(Money money)
    {
        currentState.insertCoin(money);
    }
    public Item addItem(String code, String name, int price, int quantity) {
        Item item = new Item(code, name, price);
        store.addItem(code, item, quantity);
        return item;
    }
    public void selectItem(String code)
    {
        currentState.selectItem(code);
    }

    public void dispenseItem() {
        Item item = store.getItem(selectedItemCode);
        if (balance >= item.getPrice()) {
            store.reduceStock(selectedItemCode);
            balance -= item.getPrice();
            System.out.println("Dispensed: " + item.getName());
            System.out.println("Returning change: " + balance);
        }
        reset();
        setState(new IdleState(this));
    }

    public void dispense()
    {
        currentState.dispense();
    }

    public void refundBalance()
    {
        System.out.println("Refund: "+balance);
        balance=0;
    }

    public void reset()
    {
        selectedItemCode=null;
        balance=0;
    }

    public void addBalance(int value) {
        balance += value;
    }
    public Item getSelectedItem() {
        return store.getItem(selectedItemCode);
    }
    public void setSelectedItemCode(String code) {
        this.selectedItemCode = code;
    }
    public void setState(State state) {
        this.currentState = state;
    }

    public Store getStore() { return store; }
    public int getBalance() { return balance; }
}
