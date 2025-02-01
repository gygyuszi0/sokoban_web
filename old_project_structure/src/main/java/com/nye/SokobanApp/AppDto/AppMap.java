package com.nye.SokobanApp.AppDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.nye.SokobanApp.AppDto.AppCoordinate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppMap {
    protected AppCoordinate startCoordinate;
    protected String mapContent;
}
