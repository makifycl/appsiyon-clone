package com.akif.appsiyonclone.features.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressRepository extends MongoRepository<UserAddress, String> {
}
