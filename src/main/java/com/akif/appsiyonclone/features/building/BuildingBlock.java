package com.akif.appsiyonclone.features.building;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class BuildingBlock {

    @Id
    private String id;
    private String buildingId;
    private String block;
    private String numberOfFloors;
    private String numberOfApartments;

}
