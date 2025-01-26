package com.nye.SokobanApp.AppInterface;

import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.CreateMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.ReadMapRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.ReadMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.UpdateMapResponse;

public interface AppMapInterface {
    public Long createMap(CreateMapRequest map);
    public ReadMapResponse readMap(ReadMapRequest map);
    public UpdateMapResponse updateMap(Long mapId, UpdateMapRequest map);
    public void deleteMap(Long mapId);
}
