package com.javalearning.codevita;

import java.util.Objects;

public class Item {
    private String name;
    private Double price=0.0;
    private int stock;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int stock, Double price) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void incrementStock(int stock){
        this.stock += stock;
    }

    public void decrementStock(int stock){
        this.stock -= stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getStock() == item.getStock() &&
                getName().equals(item.getName()) &&
                getPrice().equals(item.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getStock());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
