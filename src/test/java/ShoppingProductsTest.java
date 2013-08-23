import action.Product;
import action.ShoppingProducts;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class
        ShoppingProductsTest {

    @Test
    public void shouldGetProductsList() throws Exception {
        ShoppingProducts shoppingProducts = new ShoppingProducts();
        List<Product> products = shoppingProducts.getProducts();
        Product product = products.get(0);
        assertTrue(products.size() > 0);
        assertThat(product.getName(), is("Programming Perls"));
        assertTrue(product.getPrice() == 39.0);
    }

    @Test
    public void shouldAddProductTooCart() throws Exception {
        ShoppingProducts shoppingProducts = new ShoppingProducts();
        shoppingProducts.addProduct("Programming Perls");
        shoppingProducts.addProduct("Maven Action");
        assertTrue(shoppingProducts.getAddedProduct().size()>0);
        assertTrue(shoppingProducts.getAddedProduct().get(shoppingProducts.getProducts().get(0)) == 1);
    }

    @Test
    public void shouldGetRightTotalPrice() throws Exception {
        ShoppingProducts shoppingProducts = new ShoppingProducts();
        shoppingProducts.addProduct("Programming Perls");
        shoppingProducts.addProduct("Maven Action");
        assertThat(shoppingProducts.getTotalPrice(),is(104.0));

    }
}
