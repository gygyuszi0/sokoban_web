package com.nye.SokobanApp.AppImpl;

import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.CreateUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.DeleteUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.ReadUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.UpdateUserRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppCreateUserResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppReadUserResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppUpdateUserResponse;
import com.nye.SokobanApp.AppInterface.AppUserInterface;
import com.nye.storage.entity.UserEntity;
import com.nye.storage.service.UserStorage;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
//@NoArgsConstructor
public class AppUserDefaultImpl implements AppUserInterface {

    @Autowired
    private UserStorage userStorage;

    @Override
    public AppCreateUserResponse createUser(CreateUserRequest request) {
        UserEntity entity = UserEntity.builder()
                .userName(request.getUserName())
                .realName(request.getRealName())
                .password(request.getPassword())
                .build();
        UserEntity result = userStorage.save(entity);
        AppCreateUserResponse response = AppCreateUserResponse.builder()
                .id(result.getId()).build();
        return response;
    }

    @Override
    public void deleteUser(DeleteUserRequest request) {
        UserEntity entity = UserEntity.builder()
                .id(request.getId())
                .build();
        userStorage.delete(entity);
    }

    @Override
    public AppReadUserResponse readUser(ReadUserRequest request) {
        UserEntity result = userStorage.findById(request.getId()).orElseThrow();
        AppReadUserResponse response = AppReadUserResponse.builder()
                .userName(result.getUserName())
                .realName(result.getRealName())
                .build();
        return response;
    }

    @Override
    public AppUpdateUserResponse updateUser(UpdateUserRequest request) {
        UserEntity entity = UserEntity.builder()
                .id(request.getId())
                .userName(request.getUserName())
                .realName(request.getRealName())
                .password(request.getPassword())
                .build();
        UserEntity result = userStorage.save(entity);
        AppUpdateUserResponse response = AppUpdateUserResponse.builder()
                .id(result.getId()).build();
        return response;
    }
    
}
