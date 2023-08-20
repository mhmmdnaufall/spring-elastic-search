package mhmmdnaufall.elastic.search.controller;

import lombok.AllArgsConstructor;
import mhmmdnaufall.elastic.search.entity.Product;
import mhmmdnaufall.elastic.search.model.CreateProductRequest;
import mhmmdnaufall.elastic.search.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;

    @GetMapping("/products")
    public Iterable<Product> findAll() {
        return productService.getProducts();
    }

    @PostMapping("/products")
    public Product insertProduct(@RequestBody CreateProductRequest request) {
        return productService.insertProduct(request);
    }

}
