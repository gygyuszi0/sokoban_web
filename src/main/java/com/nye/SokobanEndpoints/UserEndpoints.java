package com.nye.SokobanEndpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.CreateUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.DeleteUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.ReadUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.UpdateUserRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppCreateUserResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppReadUserResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppUpdateUserResponse;
import com.nye.SokobanApp.AppInterface.AppUserInterface;

@RestController
@RequestMapping("/user")
public class UserEndpoints {

    @Autowired
    private AppUserInterface userService;

    @PostMapping("/create")
    public AppCreateUserResponse createUser(@RequestBody CreateUserRequest user) {
        return userService.createUser(user);
    }

    @GetMapping("/read/{id}")
    public AppReadUserResponse readUser(@PathVariable Long id) {
        ReadUserRequest request = ReadUserRequest.builder().id(id).build();
        return userService.readUser(request);
    }

    @PutMapping("/update/{id}")
    public AppUpdateUserResponse updateUser(@PathVariable Long id, @RequestBody UpdateUserRequest user) {
        user.setId(id);
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        DeleteUserRequest request = DeleteUserRequest.builder().id(id).build();
        userService.deleteUser(request);
    }
}
