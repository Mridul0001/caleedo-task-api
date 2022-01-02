package com.caleedo.api.param;

import com.caleedo.api.models.ParameterMasterModel;
import com.caleedo.api.models.ParameterThresholdModel;

public interface ParamThresholdService {
    public void setDefaultParamValue(ParameterMasterModel model);
    public void updateThresholdValue(ParameterThresholdModel parameterThresholdModel);
}
