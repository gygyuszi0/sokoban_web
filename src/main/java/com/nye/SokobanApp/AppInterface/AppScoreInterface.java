package com.nye.SokobanApp.AppInterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppCreateScoreRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppReadScoreRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppScoreDeleteRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppUpdateScoreRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppCreateScoreResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppReadScoreResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppUpdateScoreResponse;

@Service
public interface AppScoreInterface {
    public AppCreateScoreResponse createScore(AppCreateScoreRequest score);
    public AppReadScoreResponse readScore(AppReadScoreRequest request);
    public List<AppReadScoreResponse> readAll();
    public AppUpdateScoreResponse updateScore(AppUpdateScoreRequest request);
    public void deleteScore(AppScoreDeleteRequest request);
}
