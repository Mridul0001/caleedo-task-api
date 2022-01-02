package com.caleedo.api.aqidate;

import com.caleedo.api.models.AQIDateModel;

import java.util.List;

public interface AQIDateService {
    public void addNewValue(AQIDateModel aqiDateModel);
    List<AQIDateModel> getAllValues();
}
