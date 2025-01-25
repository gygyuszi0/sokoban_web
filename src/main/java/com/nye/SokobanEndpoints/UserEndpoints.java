package com.nye.SokobanEndpoints;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.CreateUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.UpdateUserRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppCreateUserResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppReadUserResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppUpdateUserResponse;

@RestController
@RequestMapping("/user")
public class UserEndpoints {

    @PostMapping("/create")
    public AppCreateUserResponse createUser(@RequestBody CreateUserRequest user) {
        // TODO: Implement the logic to create a new user
        return new AppCreateUserResponse();
    }

    @GetMapping("/read/{id}")
    public AppReadUserResponse readUser(@PathVariable Long id) {
        // TODO: Implement the logic to read a user by id
        return new AppReadUserResponse();
    }

    @PutMapping("/update/{id}")
    public AppUpdateUserResponse updateUser(@PathVariable Long id, @RequestBody UpdateUserRequest user) {
        // TODO: Implement the logic to update a user by id
        return new AppUpdateUserResponse();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        // TODO: Implement the logic to delete a user by id
    }
}
