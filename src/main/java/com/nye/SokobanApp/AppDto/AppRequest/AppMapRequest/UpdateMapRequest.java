package com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest;

import com.nye.SokobanApp.AppDto.AppCoordinate;
import com.nye.SokobanApp.AppDto.AppMap;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMapRequest  {
    private Long id;
    private String mapName;
    private String mapContent;
    private Integer width;
    private Integer height;
}
