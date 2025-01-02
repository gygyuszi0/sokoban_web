package com.nye.SokobanApp.AppDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.nye.SokobanApp.AppDto.AppCoordinate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppMap {
    AppCoordinate startCoordinate;
    String mapContent;
}
