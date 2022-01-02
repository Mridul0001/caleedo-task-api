package com.caleedo.api.param;

import com.caleedo.api.models.ParameterMasterModel;
import com.caleedo.api.models.ParameterThresholdModel;

public interface ParamMasterService {
    public ParameterMasterModel addNewParameter(ParameterMasterModel parameterMasterModel);
    public void updateThreshold(ParameterThresholdModel parameterThresholdModel);
}
