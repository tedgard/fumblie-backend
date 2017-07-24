package com.zooplus.fumbliebackend.repo;

import com.zooplus.fumbliebackend.model.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
}
