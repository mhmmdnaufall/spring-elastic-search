package mhmmdnaufall.elastic.search.service.impl;

import lombok.AllArgsConstructor;
import mhmmdnaufall.elastic.search.entity.Product;
import mhmmdnaufall.elastic.search.model.CreateProductRequest;
import mhmmdnaufall.elastic.search.repository.ProductRepository;
import mhmmdnaufall.elastic.search.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product insertProduct(CreateProductRequest request) {

        return productRepository.save(
            Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name(request.getName())
                    .description(request.getDescription())
                    .quantity(request.getQuantity())
                    .price(request.getPrice())
                    .build()
        );

    }
}
