package com.akif.appsiyonclone.features.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Document
public class User {

    @Id
    private String id;
    private String buildingName;
    @Indexed(unique = true)
    private String username;
    private String password;
    private String fullName;
    @Indexed(unique = true)
    private String phoneNumber;
    @Indexed(unique = true)
    private String mail;
    private List<UserAddress> userAddresses;
    private LocalDateTime lastLogin;
}
