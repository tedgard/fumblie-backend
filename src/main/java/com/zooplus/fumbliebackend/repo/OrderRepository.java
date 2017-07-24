package com.zooplus.fumbliebackend.repo;

import com.zooplus.fumbliebackend.model.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{
}
