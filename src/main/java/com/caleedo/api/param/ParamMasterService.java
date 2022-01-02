package com.caleedo.api.param;

import com.caleedo.api.models.ParameterMasterModel;
import com.caleedo.api.models.ParameterThresholdModel;

import java.util.HashMap;
import java.util.List;

public interface ParamMasterService {
    ParameterMasterModel addNewParameter(ParameterMasterModel parameterMasterModel);
    void updateThreshold(ParameterThresholdModel parameterThresholdModel);
    HashMap<Integer,ThresholdModel> getAllThresholds();
}
