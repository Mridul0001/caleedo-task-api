package com.caleedo.api.repos;

import com.caleedo.api.models.CustomerModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerModel,Integer> {
    @Query("{id:?0}")
    public CustomerModel findCutomerById(Integer id);
}
