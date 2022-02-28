package com.akif.appsiyonclone.features.user;

import java.util.List;

public record UserDTO(String buildingId,
                      String fullName,
                      String phoneNumber,
                      String mail,
                      List<UserAddressDTO> userAddresses) {}
