package com.nye.SokobanApp.AppImpl;

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
        CoordinateEntity coordinate = CoordinateEntity.builder()
                .x(map.getStartCoordinate().getX())
                .y(map.getStartCoordinate().getY())
                .build();
        MapEntity request = MapEntity.builder()
                .mapContent(map.getMapContent())
                .startCoordinateX(coordinate.getX())
                .startCoordinateY(coordinate.getY())
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
    }

    @Override
    public ReadMapResponse readMap(ReadMapRequest map) {
        // TODO Auto-generated method stub
        return new ReadMapResponse();
    }

    @Override
    public UpdateMapResponse updateMap(UpdateMapRequest map) {
        // TODO Auto-generated method stub
        return new UpdateMapResponse();
    }
    
}
