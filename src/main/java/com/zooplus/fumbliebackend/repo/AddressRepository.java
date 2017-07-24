package com.zooplus.fumbliebackend.repo;

import com.zooplus.fumbliebackend.model.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository  extends CrudRepository<Address, Long> {
}
