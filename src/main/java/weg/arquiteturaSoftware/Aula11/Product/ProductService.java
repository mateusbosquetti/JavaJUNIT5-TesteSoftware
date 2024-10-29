package weg.arquiteturaSoftware.Aula11.Product;

import java.util.List;

public class ProductService {

    private Productrepository repository;

    public ProductService(Productrepository repository) {
        this.repository = repository;
    }

    public Product findProductById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public List<Product> findAllProducts() {
        return repository.findAll();
    }


}
