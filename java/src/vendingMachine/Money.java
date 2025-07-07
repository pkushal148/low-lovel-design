package vendingMachine;

public enum Money {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY_FIVE(25);

    private final int value;

    Money(int value)
    {
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
