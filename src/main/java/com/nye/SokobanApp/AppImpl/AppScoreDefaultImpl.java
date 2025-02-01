package com.nye.SokobanApp.AppImpl;

import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppCreateScoreRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppReadScoreRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppScoreDeleteRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppUpdateScoreRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppCreateScoreResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppReadScoreResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppUpdateScoreResponse;
import com.nye.SokobanApp.AppInterface.AppScoreInterface;

public class AppScoreDefaultImpl implements AppScoreInterface {

    @Override
    public AppCreateScoreResponse createScore(AppCreateScoreRequest request) {
        // TODO Auto-generated method stub
        return new AppCreateScoreResponse();
    }

    @Override
    public void deleteScore(AppScoreDeleteRequest request) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public AppReadScoreResponse readScore(AppReadScoreRequest request) {
        // TODO Auto-generated method stub
        return new AppReadScoreResponse();
    }

    @Override
    public AppUpdateScoreResponse updateScore(AppUpdateScoreRequest request) {
        // TODO Auto-generated method stub
        return new AppUpdateScoreResponse();
    }
    
}
