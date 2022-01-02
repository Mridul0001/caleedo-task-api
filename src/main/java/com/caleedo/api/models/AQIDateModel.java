package com.caleedo.api.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Document("aqidate")
public class AQIDateModel {
    @Id
    String id;
    int custId;
    LocalDateTime localDateTime;
    int paramId;
    @NotNull
    double value;
}
