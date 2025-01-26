package com.nye.SokobanApp.AppInterface;

import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.CreateUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.DeleteUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.ReadUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.UpdateUserRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppCreateUserResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppReadUserResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppUpdateUserResponse;

public interface AppUserInterface {
    public AppCreateUserResponse createUser(CreateUserRequest request);
    public AppReadUserResponse readUser(ReadUserRequest request);
    public AppUpdateUserResponse updateUser(UpdateUserRequest request);
    public void deleteUser(DeleteUserRequest request);
}
