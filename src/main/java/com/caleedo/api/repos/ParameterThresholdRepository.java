package com.caleedo.api.repos;

import com.caleedo.api.models.ParameterThresholdModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterThresholdRepository extends MongoRepository<ParameterThresholdModel,String> {
    @Query("{paramId:?0}")
    public ParameterThresholdModel findByParamId(Integer paramId);
}
