package com.codegym;

public class Product {
    private String id;
    private String name;
    private double price;
    private String quantity;
    private String note;

    public Product() {
    }

    public Product(String id, String name, double price, String quantity, String note) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Thông tin sản phẩm" +
                " id= " + id +
                " name= " + name +
                " price= " + price  +
                " quantity= " + quantity  +
                " note: " + note +
                '.';
    }
}