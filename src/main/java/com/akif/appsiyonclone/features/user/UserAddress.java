package com.akif.appsiyonclone.features.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class UserAddress {

    @Id
    private String id;
    private String userId;
    private String buildingId;
    private String block;
    private String floor;
    private String apartmentNo;
}
