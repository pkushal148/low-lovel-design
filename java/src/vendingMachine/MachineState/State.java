package vendingMachine.MachineState;

import vendingMachine.Item;
import vendingMachine.Money;
import vendingMachine.VendingMachine;

public abstract class State {

    VendingMachine machine;

    public State(VendingMachine machine) {
        this.machine = machine;
    }

    public abstract void insertCoin(Money money);
    public abstract void selectItem(String code);
    public abstract void dispense();
    public abstract void refund();

}
