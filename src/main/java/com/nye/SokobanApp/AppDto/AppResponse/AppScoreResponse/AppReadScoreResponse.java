package com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse;

import com.nye.SokobanApp.AppDto.AppScoreWithId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppReadScoreResponse {
    private Long mapId;
    private Long userId;
    private Float time;
}
