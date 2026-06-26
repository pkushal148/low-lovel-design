package designPatterns.factory;

public interface Factory {
    public Product createProduct();

    default void performAction(){
        Product item = createProduct();
        item.performAction();
    }
}
