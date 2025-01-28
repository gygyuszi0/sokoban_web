package com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse;

import com.nye.SokobanApp.AppDto.AppUser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppReadUserResponse {
    private String userName;
    private String realName;
}
