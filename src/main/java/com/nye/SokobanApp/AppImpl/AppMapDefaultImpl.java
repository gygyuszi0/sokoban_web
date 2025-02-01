package com.nye.SokobanApp.AppImpl;

import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.CreateMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.DeleteMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.ReadMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.UpdateMapRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.CreateMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.ReadMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.UpdateMapResponse;
import com.nye.SokobanApp.AppInterface.AppMapInterface;
import org.springframework.stereotype.Service;

@Service
public class AppMapDefaultImpl implements AppMapInterface {

    @Override
    public CreateMapResponse createMap(CreateMapRequest map) {
        // TODO Auto-generated method stub
        return new CreateMapResponse();
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
