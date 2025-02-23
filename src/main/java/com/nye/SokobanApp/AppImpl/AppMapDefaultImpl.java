package com.nye.SokobanApp.AppImpl;

import java.util.List;

import com.nye.storage.entity.CoordinateEntity;
import com.nye.storage.entity.MapEntity;
import com.nye.storage.service.MapStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.CreateMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.DeleteMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.ReadMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.UpdateMapRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.CreateMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.ReadMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.UpdateMapResponse;
import com.nye.SokobanApp.AppInterface.AppMapInterface;

@Service
public class AppMapDefaultImpl implements AppMapInterface {

    @Autowired
    private MapStorage mapStorage;

    @Override
    public CreateMapResponse createMap(CreateMapRequest map) {
        MapEntity request = MapEntity.builder()
                .mapName(map.getMapName())
                .mapContent(map.getMapContent())
                .widht(map.getWidth())
                .height(map.getHeight())
                .build();
        MapEntity response = mapStorage.save(request);
        CreateMapResponse result = CreateMapResponse.builder().
                id(response.getId())
                .build();
        return result;
    }

    @Override
    public void deleteMap(DeleteMapRequest map) {
        // TODO Auto-generated method stub
        MapEntity entity = MapEntity.builder().id(map.getId()).build();
        mapStorage.delete(entity);
    }

    @Override
    public ReadMapResponse readMap(ReadMapRequest map) {
        MapEntity entity = mapStorage.findById(map.getId()).orElseThrow();
        ReadMapResponse response = ReadMapResponse.builder()
                .id(entity.getId())
                .mapName(entity.getMapName())
                .mapContent(entity.getMapContent())
                .build();
        return response;
    }

    @Override
    public UpdateMapResponse updateMap(UpdateMapRequest map) {
        MapEntity entity = MapEntity.builder()
                .id(map.getId())
                .mapName(map.getMapName())
                .mapContent(map.getMapContent())
                .widht(map.getWidth())
                .height(map.getHeight())
                .build();
        entity = mapStorage.save(entity);
        UpdateMapResponse response = UpdateMapResponse.builder()
                .id(entity.getId())
                .build();
        return response;
    }

    @Override
    public List<ReadMapResponse> readAllMap() {
        List<MapEntity> result = (List<MapEntity>) mapStorage.findAll();
        if (!result.isEmpty()) {
            return result.stream().map(currentMap -> ReadMapResponse.builder()
                    .id(currentMap.getId())
                    .mapName(currentMap.getMapName())
                    .mapContent(currentMap.getMapContent())
                    .build()
            ).toList();
        }

        return List.of();
    }

}
