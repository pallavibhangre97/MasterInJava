package com.javalearning.codevita;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    static Map<String,Item> items = new HashMap<>();

    static  {
        items.put("SHOE",new Item("SHOE"));
        items.put("SHIRT",new Item("SHOE"));
    }

    public int addItem(String itemName, int quantity){

        Item item = items.get(itemName);
        if (null!=item && quantity<0) return -1;
        items.get(itemName).incrementStock(quantity);
        return quantity;
    }

    public int removeItem(String itemName){
        Item item = items.get(itemName);
        if(null == item){
            return -1;
        }
        items.remove(itemName);
        return 1;
    }

    public int getQuantity(String itemName){
        Item item = items.get(itemName);
        if(null == item){
            return 0;
        }
        return items.get(itemName).getStock();
    }

    public void setCost(String itemName,Double cost){
        Item item = items.get(itemName);
        if(null == item && cost<0){
            System.out.println("-1");
        }
         items.get(itemName).setPrice(cost);
        System.out.println(cost);
    }

    public int increment(String itemName,int quantity){
        Item item = items.get(itemName);
        if(null == item && quantity< 0){
            return -1;
        }
        items.get(itemName).incrementStock(quantity);
        return quantity;
    }

    public int decrement(String itemName,int quantity){
        Item item = items.get(itemName);
        if(null == item && quantity< 0){
            return -1;
        }
        items.get(itemName).decrementStock(quantity);
        return quantity;
    }

    public static Item getInventoryItem(String itemName) {
        return items.get(itemName);
    }


    private boolean validateItem(String itemName) {
        Item item = items.get(itemName);
        if(null == item){
            return true;
        }
        return false;
    }
}
