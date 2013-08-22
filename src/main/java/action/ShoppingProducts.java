package action;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("shoppingProducts")
public class ShoppingProducts{
    private List<Product> products = new ArrayList<Product>();

    public List<Product> getProducts() {
        products.add(new Product("Programming Perls",39.0));
        products.add(new Product("Maven Action",65.0));
        products.add(new Product("Head First design pattern",98.0));
        return products;
    }
}
