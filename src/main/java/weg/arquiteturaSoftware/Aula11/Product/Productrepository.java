package weg.arquiteturaSoftware.Aula11.Product;

import java.util.List;
import java.util.Optional;

public interface Productrepository {


    Optional<Product> findById(String id);

    List<Product> findAll();


}
