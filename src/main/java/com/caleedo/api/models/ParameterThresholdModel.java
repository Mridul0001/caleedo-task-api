package com.caleedo.api.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("paramthres")
public class ParameterThresholdModel {
    @Id
    String id;
    int paramId;
    double lowerValue;
    double upperValue;
}
