package com.caleedo.api.param;

import com.caleedo.api.constants.GlobalConstants;
import com.caleedo.api.helpers.SequenceService;
import com.caleedo.api.models.ParameterMasterModel;
import com.caleedo.api.models.ParameterThresholdModel;
import com.caleedo.api.repos.ParameterMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ParamMasterServiceImpl implements ParamMasterService{
    @Autowired SequenceService sequenceService;
    @Autowired ParameterMasterRepository parameterMasterRepository;
    @Autowired ParamThresholdService paramThresholdService;
    @Override
    public ParameterMasterModel addNewParameter(ParameterMasterModel parameterMasterModel) {
        //Can add duplicate check here as well
        int id = sequenceService.getSequence(GlobalConstants.PARAMMASTER);
        parameterMasterModel.setId(id);
        parameterMasterRepository.save(parameterMasterModel);
        paramThresholdService.setDefaultParamValue(parameterMasterModel);
        return parameterMasterModel;
    }

    @Override
    public void updateThreshold(ParameterThresholdModel parameterThresholdModel) {
        paramThresholdService.updateThresholdValue(parameterThresholdModel);
    }

    @Override
    public HashMap<Integer,ThresholdModel> getAllThresholds() {
        return paramThresholdService.getAllThresholds();
    }
}
