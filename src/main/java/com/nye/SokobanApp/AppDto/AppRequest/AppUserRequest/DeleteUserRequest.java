package com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest;

import com.nye.SokobanApp.AppDto.AppUserGetter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteUserRequest {
    private Long id;
}
