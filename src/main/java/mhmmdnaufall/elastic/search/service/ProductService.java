package mhmmdnaufall.elastic.search.service;

import mhmmdnaufall.elastic.search.entity.Product;
import mhmmdnaufall.elastic.search.model.CreateProductRequest;

public interface ProductService {

    Iterable<Product> getProducts();

    Product insertProduct(CreateProductRequest request);


}
