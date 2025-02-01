package com.nye.SokobanApp.AppDto.AppRequest.AppUserRequest;

import com.nye.SokobanApp.AppDto.AppGetter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReadUserRequest {
    private Long id;
}
