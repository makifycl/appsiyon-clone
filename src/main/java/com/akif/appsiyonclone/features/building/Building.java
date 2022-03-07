package com.akif.appsiyonclone.features.building;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class Building {

    @Id
    private String id;
    private String customerId;
    private String name;
    private String address;

}
