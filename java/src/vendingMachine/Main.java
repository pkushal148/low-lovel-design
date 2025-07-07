package vendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        vendingMachine.addItem("A1", "Coke", 25, 3);
        vendingMachine.addItem("A2", "Pepsi", 25, 2);
        vendingMachine.addItem("B1", "Water", 10, 5);

        System.out.println("\n--- Step 1: Select an item ---");
        vendingMachine.selectItem("A1");

        // Insert coins
        System.out.println("\n--- Step 2: Insert coins ---");
        vendingMachine.insertCoin(Money.TEN);
        vendingMachine.insertCoin(Money.TEN);
        vendingMachine.insertCoin(Money.FIVE);

        // Dispense the product
        System.out.println("\n--- Step 3: Dispense item ---");
        vendingMachine.dispense(); // Should dispense Coke

        // Select another item
//        System.out.println("\n--- Step 4: Select another item ---");
//        vendingMachine.selectItem("B1");
//
//        // Insert more amount
//        System.out.println("\n--- Step 5: Insert more than needed ---");
//        vendingMachine.insertCoin(Money.TWENTY_FIVE); // 25
//
//        // Try to dispense the product
//        System.out.println("\n--- Step 6: Dispense and return change ---");
//        vendingMachine.dispense();

    }
}
