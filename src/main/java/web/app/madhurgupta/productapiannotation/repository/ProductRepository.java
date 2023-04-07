package web.app.madhurgupta.productapiannotation.repository;

import web.app.madhurgupta.productapiannotation.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository
        extends ReactiveMongoRepository<Product, String>  {
}
