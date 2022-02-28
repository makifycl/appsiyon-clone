package com.akif.appsiyonclone.features.user;

import java.util.List;

// TODO Do not use record if you want exclude a field from request
public record UserDTO(String buildingId,
                      String username,
                      String password,
                      String fullName,
                      String phoneNumber,
                      String mail,
                      List<UserAddressDTO> userAddresses) {}
