package action;

import java.io.Serializable;

public class Product implements Serializable{

    private double price;
    private String name;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
