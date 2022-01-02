package com.caleedo.api.repos;

import com.caleedo.api.models.ParameterMasterModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterMasterRepository extends MongoRepository<ParameterMasterModel,Integer> {
    @Query("{id:?0}")
    public ParameterMasterModel findParamById(Integer id);
}
