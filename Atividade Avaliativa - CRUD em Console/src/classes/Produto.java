package classes;

import java.io.Serializable;

public class Produto implements Serializable {
    private int id, quantity;
    private String name, description;
    private double price;

    public Produto(int id, String name, String description, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProduto - ( \nID: " + id + "\nName: " + name + "\nDescription: " + description + "\nPrice: " + price
                + "\nQuantity: "
                + quantity + "\n)";
    }

}
