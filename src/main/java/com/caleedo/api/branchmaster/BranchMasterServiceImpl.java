package com.caleedo.api.branchmaster;

import com.caleedo.api.constants.GlobalConstants;
import com.caleedo.api.helpers.SequenceService;
import com.caleedo.api.models.BranchMasterModel;
import com.caleedo.api.repos.BranchMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchMasterServiceImpl implements BranchMasterService{
    @Autowired SequenceService sequenceService;
    @Autowired BranchMasterRepository branchMasterRepository;
    @Override
    public BranchMasterModel addNewBranch(BranchMasterModel branchMasterModel) {
        //Can add duplication check here, but not adding due to time constraint
        int id = sequenceService.getSequence(GlobalConstants.BRANCHMASTER);
        branchMasterModel.setId(id);
        branchMasterRepository.save(branchMasterModel);
        return branchMasterModel;
    }

    @Override
    public BranchMasterModel findBranchById(int id) {
        BranchMasterModel branchMasterModel = branchMasterRepository.findBranchById(id);
        return branchMasterModel;
    }
}
