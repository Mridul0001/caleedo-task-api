package com.caleedo.api.param;

import com.caleedo.api.models.ParameterMasterModel;
import com.caleedo.api.models.ParameterThresholdModel;

import java.util.List;

public interface ParamThresholdService {
    void setDefaultParamValue(ParameterMasterModel model);
    void updateThresholdValue(ParameterThresholdModel parameterThresholdModel);
    List<ParameterThresholdModel> getAllThresholds();
}
