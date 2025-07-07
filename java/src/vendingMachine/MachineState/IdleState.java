package vendingMachine.MachineState;

import vendingMachine.Money;
import vendingMachine.VendingMachine;

public class IdleState extends State{
    public IdleState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin(Money money) {
        System.out.print("Select item before entering money");
    }

    @Override
    public void selectItem(String code) {
        if (!machine.getStore().isAvailable(code)) {
            System.out.println("Item not available.");
            return;
        }
        machine.setSelectedItemCode(code);
        machine.setState(new ItemSelectState(machine));
        System.out.println("Item selected: " + code);
    }

    @Override
    public void dispense() {
        System.out.print("No item selected");
    }

    @Override
    public void refund() {
        System.out.print("No money to refund");
    }
}
