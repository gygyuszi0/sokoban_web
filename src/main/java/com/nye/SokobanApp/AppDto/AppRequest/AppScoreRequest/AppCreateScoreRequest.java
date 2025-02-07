package com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest;

import com.nye.SokobanApp.AppDto.AppScoreWithId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppCreateScoreRequest  {
    private Long mapId;
    private Long userId;
    private Float time;
}
