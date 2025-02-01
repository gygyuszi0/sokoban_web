package com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest;

import com.nye.SokobanApp.AppDto.AppScoreId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppScoreDeleteRequest {
    private Long mapId;
    private Long userId;
}
