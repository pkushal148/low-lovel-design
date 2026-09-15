package problems.vendingMachine.MachineState;

import problems.vendingMachine.Money;
import problems.vendingMachine.VendingMachine;

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
