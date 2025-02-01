package com.nye.SokobanApp.AppImpl;

import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.CreateUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.DeleteUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.ReadUserRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest.UpdateUserRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppCreateUserResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppReadUserResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse.AppUpdateUserResponse;
import com.nye.SokobanApp.AppInterface.AppUserInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
//@NoArgsConstructor
public class AppUserDefaultImpl implements AppUserInterface {

    @Override
    public AppCreateUserResponse createUser(CreateUserRequest request) {
        // TODO Auto-generated method stub
        return new AppCreateUserResponse();
    }

    @Override
    public void deleteUser(DeleteUserRequest request) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public AppReadUserResponse readUser(ReadUserRequest request) {
        // TODO Auto-generated method stub
        return new AppReadUserResponse();
    }

    @Override
    public AppUpdateUserResponse updateUser(UpdateUserRequest request) {
        // TODO Auto-generated method stub
        return new AppUpdateUserResponse();
    }
    
}
