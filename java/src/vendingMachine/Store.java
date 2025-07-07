package vendingMachine;

import java.util.HashMap;

public class Store {
    private final HashMap<String,Item> itemMap=new HashMap<>();
    private final HashMap<String,Integer> stockMap=new HashMap<>();

    public void addItem(String code,Item i,int quantity)
    {
        itemMap.put(code,i);
        stockMap.put(code,quantity);
    }

    public Item getItem(String code)
    {
        return itemMap.get(code);
    }

    public boolean isAvailable(String code)
    {
        return stockMap.getOrDefault(code,0)>0;
    }

    public void reduceStock(String code)
    {
        stockMap.put(code,stockMap.get(code)-1);
    }
}
