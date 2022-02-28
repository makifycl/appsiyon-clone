package com.akif.appsiyonclone.features.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserAddressRepository userAddressRepository;

    public UserService(UserRepository userRepository,
                       UserAddressRepository userAddressRepository) {
        this.userRepository = userRepository;
        this.userAddressRepository = userAddressRepository;
    }

    public UserDTO createUser(UserDTO newUser) {

        User user = new User();
        user.setFullName(newUser.fullName());
        user.setPhoneNumber(newUser.phoneNumber());
        user.setMail(newUser.mail());

        User createdUser = userRepository.save(user);

        List<UserAddress> userAddresses = new ArrayList<>();

        newUser.userAddresses().forEach(address -> {
            UserAddress userAddress = new UserAddress();
            userAddress.setUserId(createdUser.getId());
            userAddress.setBuildingId(address.buildingId());
            userAddress.setBlock(address.block());
            userAddress.setFloor(address.floor());
            userAddress.setApartmentNo(address.apartmentNo());
            userAddresses.add(userAddress);
        });

        user.setUserAddresses(userAddresses);

        userAddressRepository.saveAll(userAddresses);

        return new UserDTO(
                newUser.buildingId(),
                user.getFullName(),
                user.getPhoneNumber(),
                user.getMail(),
                newUser.userAddresses());
    }
}
