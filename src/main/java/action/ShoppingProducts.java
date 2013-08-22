package action;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("shoppingProducts")
public class ShoppingProducts{
    public Map<Product, Integer> getAddedProduct() {
        return addedProduct;
    }

    private List<Product> products;
    private Map<Product, Integer> addedProduct = new HashMap<Product, Integer>();
    public ShoppingProducts(){
        initProducts();
    }
    public List<Product> getProducts() {
        return products;
    }

    private void initProducts() {
        products = new ArrayList<Product>();
        products.add(new Product("Programming Perls",39.0));
        products.add(new Product("Maven Action",65.0));
        products.add(new Product("Head First design pattern",98.0));
    }

    public void addProduct(String name) {
        Product product =products.get(1);
        for(int i=0;i<products.size();i++){
            if(products.get(i).getName().equals(name)){
                product=products.get(i);
                break;
            }
        }
        if(!addedProduct.containsKey(product)){
            addedProduct.put(product,1);
        } else {
             addedProduct.put(product,addedProduct.get(product)+1);
        }
    }
}
