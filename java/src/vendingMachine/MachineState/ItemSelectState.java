package vendingMachine.MachineState;

import vendingMachine.Money;
import vendingMachine.VendingMachine;

public class ItemSelectState extends State{
    public ItemSelectState(VendingMachine machine) {
        super(machine);
    }
    @Override
    public void insertCoin(Money money) {
        machine.addBalance(money.getValue());
        System.out.println("money inserted: "+money.getValue());
        double price=machine.getSelectedItem().getPrice();
        if(machine.getBalance()>=price) {
            System.out.println("Sufficient Money Received");
            machine.setState(new HasMoneyState(machine));
        }
    }

    @Override
    public void selectItem(String code) {
        System.out.println("item already selected");
    }

    @Override
    public void dispense() {
        System.out.println("Please insert sufficient money");
    }

    @Override
    public void refund() {
        machine.reset();
        machine.setState(new IdleState(machine));
    }
}
