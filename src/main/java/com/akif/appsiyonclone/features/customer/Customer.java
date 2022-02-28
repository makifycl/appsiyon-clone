package com.akif.appsiyonclone.features.customer;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class Customer {

    @Id
    private String id;
    private String username;
    private String password;
    //private List<Building> buildings;
    private String name;
    private String mail;
    private String phone;
}
