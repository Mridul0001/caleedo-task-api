package com.caleedo.api.repos;

import com.caleedo.api.models.AQIDateModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AQIDateRepository extends MongoRepository<AQIDateModel,String> {
}
