package com.nye.SokobanApp.AppDto.AppResponse.AppUserResponse;

import com.nye.SokobanApp.AppDto.AppUserWithId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUpdateUserResponse {
    private Long id;
}
