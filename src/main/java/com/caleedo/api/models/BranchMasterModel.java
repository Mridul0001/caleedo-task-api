package com.caleedo.api.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Document("branchmstr")
public class BranchMasterModel {
    @Id
    int id;
    @NotNull
    String branchName;
}
