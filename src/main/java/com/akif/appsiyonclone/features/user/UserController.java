package com.akif.appsiyonclone.features.user;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/v1/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user) {

        UserDTO newUser = userService.createUser(user);
        return new ResponseEntity<UserDTO>(newUser, HttpStatus.OK);
    }
}
