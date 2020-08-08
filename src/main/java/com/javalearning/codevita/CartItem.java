package com.javalearning.codevita;

public class CartItem {

    Item item;
    int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CartItem(String itemName,int quantity) {
        this.item = Inventory.getInventoryItem(itemName);
        this.quantity = quantity;
    }

    public void incrementQty(int quantity){
        this.quantity += quantity;
    }

    public void decrememtQty(int quantity){
        this.quantity -= quantity;
    }

    public Double getPrice(){
        return item.getPrice();
    }

}
