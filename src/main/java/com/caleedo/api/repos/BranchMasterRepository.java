package com.caleedo.api.repos;

import com.caleedo.api.models.BranchMasterModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchMasterRepository extends MongoRepository<BranchMasterModel,Integer> {

    @Query("{id:?0}")
    BranchMasterModel findBranchById(Integer id);
}
