package com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse;

import com.nye.SokobanApp.AppDto.AppCoordinate;
import com.nye.SokobanApp.AppDto.AppMap;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ReadMapResponse {
    private Long id;
    private String mapName;
    private String mapContent;
}
