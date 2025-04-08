package com.nye.SokobanApp.AppInterface;

import java.util.List;

import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.UpdateMapRequest;

import org.springframework.stereotype.Service;

import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.CreateMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.DeleteMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.ReadMapRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.CreateMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.ReadMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.UpdateMapResponse;

@Service
public interface AppMapInterface {
    public CreateMapResponse createMap(CreateMapRequest map);
    public ReadMapResponse readMap(ReadMapRequest map);
    public List<ReadMapResponse> readAllMap();
    public UpdateMapResponse updateMap(UpdateMapRequest map);
    public void deleteMap(DeleteMapRequest map);
}
