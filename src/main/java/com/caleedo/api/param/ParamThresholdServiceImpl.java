package com.caleedo.api.param;

import com.caleedo.api.constants.GlobalConstants;
import com.caleedo.api.models.ParameterMasterModel;
import com.caleedo.api.models.ParameterThresholdModel;
import com.caleedo.api.repos.ParameterThresholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParamThresholdServiceImpl implements ParamThresholdService{
    @Autowired ParameterThresholdRepository parameterThresholdRepository;
    @Override
    public void setDefaultParamValue(ParameterMasterModel model) {
        //This logic can be made dynamic as well, but not doing so for time constraint
        switch (model.getParamName()){
            case "CO2":
                setDefaultParamValueHelper(model.getId(), GlobalConstants.CO2_LOWER_VALUE,GlobalConstants.CO2_UPPER_VALUE);
                break;
            case "Temperature":
                setDefaultParamValueHelper(model.getId(),GlobalConstants.TEMP_LOWER_VALUE,GlobalConstants.TEMP_UPPER_VALUE);
                break;
            case "Humidity":
                setDefaultParamValueHelper(model.getId(),GlobalConstants.HUMIDITY_LOWER_VALUE,GlobalConstants.HUMIDITY_UPPER_VALUE);
                break;
            case "PM2":
                setDefaultParamValueHelper(model.getId(),GlobalConstants.PM2_LOWER_VALUE,GlobalConstants.PM2_UPPER_VALUE);
                break;
            case "PM10":
                setDefaultParamValueHelper(model.getId(),GlobalConstants.PM10_LOWER_VALUE,GlobalConstants.PM10_UPPER_VALUE);
                break;
            case "TVOC":
                setDefaultParamValueHelper(model.getId(),GlobalConstants.TVOC_LOWER_VALUE,GlobalConstants.TVOC_UPPER_VALUE);
                break;

        }
    }

    @Override
    public void updateThresholdValue(ParameterThresholdModel parameterThresholdModel) {
        ParameterThresholdModel temp = parameterThresholdRepository.findByParamId(parameterThresholdModel.getParamId());
        temp.setLowerValue(parameterThresholdModel.getLowerValue());
        temp.setUpperValue(parameterThresholdModel.getUpperValue());
        parameterThresholdRepository.save(temp);
    }

    @Override
    public List<ParameterThresholdModel> getAllThresholds() {
        return parameterThresholdRepository.findAll();
    }

    private void setDefaultParamValueHelper(int id,double lowerValue,double upperValue){
        ParameterThresholdModel p = new ParameterThresholdModel();
        p.setParamId(id);
        p.setLowerValue(lowerValue);
        p.setUpperValue(upperValue);
        parameterThresholdRepository.save(p);
    }
}
