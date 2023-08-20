package mhmmdnaufall.elastic.search.repository;

import mhmmdnaufall.elastic.search.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, Integer> { }
