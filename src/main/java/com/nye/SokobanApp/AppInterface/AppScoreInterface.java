package com.nye.SokobanApp.AppInterface;

import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppUpdateScoreRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppCreateScoreResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppReadScoreResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppUpdateScoreResponse;

public interface AppScoreInterface {
    public AppCreateScoreResponse createScore(AppCreateScoreRequest request);
    public AppReadScoreResponse readScore(AppReadScoreRequest request);
    public AppUpdateScoreResponse updateScore(AppUpdateScoreRequest request);
    public void deleteScore(AppDeleteScoreRequest request);
}
