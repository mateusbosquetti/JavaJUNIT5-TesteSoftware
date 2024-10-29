package Aula11;

import net.bytebuddy.build.Plugin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import weg.arquiteturaSoftware.Aula11.Product.Product;
import weg.arquiteturaSoftware.Aula11.Product.ProductService;
import weg.arquiteturaSoftware.Aula11.Product.Productrepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {

    private ProductService productService;
    private InMemoryProductRepository productRepository;

    private static class InMemoryProductRepository implements Productrepository {

        private List<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        @Override
        public Optional<Product> findById(String id) {
            return Optional.empty();
        }

        @Override
        public List<Product> findAll() {
            return null;
        }
    }

    @BeforeEach
    public void setUp() {
        productRepository = new InMemoryProductRepository();
        productService = new ProductService(productRepository);
    }

    @Test
    public void testFindProductById() {

        Product product = new Product("1", "Product 1");
        productRepository.addProduct(product);

        Product result = productService.findProductById("1");
        assertEquals("Product 1", result.getName());
    }

    @Test
    public void testFindAllProducts() {
        Product product = new Product("1", "Product 1");
        productRepository.addProduct(product);

        List<Product> result = productService.findAllProducts();
        assertEquals(1, result.size());
    }

}
