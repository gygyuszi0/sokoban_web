package com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class AppUpdateScoreResponse {
    private Long mapId;
    private Long userId;
}
