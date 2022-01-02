package com.caleedo.api.branchmaster;

import com.caleedo.api.models.BranchMasterModel;
import org.springframework.stereotype.Service;

@Service
public interface BranchMasterService {
    public BranchMasterModel addNewBranch(BranchMasterModel branchMasterModel);
    public BranchMasterModel findBranchById(int id);
}
