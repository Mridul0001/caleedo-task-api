package com.caleedo.api.aqidate;

import com.caleedo.api.models.AQIDateModel;
import com.caleedo.api.repos.AQIDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AQIDateServiceImpl implements AQIDateService{
    @Autowired AQIDateRepository aqiDateRepository;
    @Override
    public void addNewValue(AQIDateModel aqiDateModel) {
        LocalDateTime now = LocalDateTime.now();
        aqiDateModel.setLocalDateTime(now);
        aqiDateRepository.save(aqiDateModel);
    }

    @Override
    public List<AQIDateModel> getAllValues() {
        List<AQIDateModel> res = aqiDateRepository.findAll();
        return  res;
    }
}
