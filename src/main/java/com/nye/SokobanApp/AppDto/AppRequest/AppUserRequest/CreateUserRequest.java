package com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest;

import com.nye.SokobanApp.AppDto.AppUserWithId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
    private String userName;
    private String realName;
    private String password;
}
