package com.javalearning.codevita;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<String,CartItem> cartItems = new HashMap<>();
    
    public int addItem(String itemName,int quantity){
        if (validateItem(itemName) && quantity <0) return -1;

        cartItems.put(itemName,new CartItem(itemName,quantity));
        return quantity;
    }

    public int removeItem(String itemName){
        if (validateItem(itemName)) return -1;
        cartItems.remove(itemName);
        return 1;
    }

    private boolean validateItem(String itemName) {
        CartItem CartItem = cartItems.get(itemName);
        if(null == CartItem){
            return true;
        }
        return false;
    }

    public int increment(String itemName,int quantity){
        if (validateItem(itemName) && quantity <0) return -1;
        cartItems.get(itemName).incrementQty(quantity);
        return quantity;
    }

    public int decrement(String itemName,int quantity){
        if (validateItem(itemName) && quantity<0) return -1;
        cartItems.get(itemName).decrememtQty(quantity);
        return quantity;
    }

    public Double getOrderAmount(){
        Double total = 0.0;
        for (Map.Entry<String,CartItem> entry : cartItems.entrySet()) {
            total += entry.getValue().getPrice() * entry.getValue().getQuantity();
        }
        return total;
    }

}
