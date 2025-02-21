package com.nye.SokobanApp.AppImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppCreateScoreRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppReadScoreRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppScoreDeleteRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppUpdateScoreRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppCreateScoreResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppReadScoreResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppUpdateScoreResponse;
import com.nye.SokobanApp.AppInterface.AppScoreInterface;
import com.nye.storage.entity.ScoreEntity;
import com.nye.storage.entity.ScoreId;
import com.nye.storage.service.ScoreStorage;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
//@AllArgsConstructor
public class AppScoreDefaultImpl implements AppScoreInterface {

    @Autowired
    private ScoreStorage scoreStorage;

    @Override
    public AppCreateScoreResponse createScore(AppCreateScoreRequest request) {
        ScoreEntity entity = ScoreEntity.builder()
                .mapId(request.getMapId())
                .userId(request.getUserId())
                .score(request.getTime())
                .build();
        ScoreEntity result = scoreStorage.save(entity);
        AppCreateScoreResponse response = AppCreateScoreResponse.builder()
                .mapId(result.getMapId())
                .userId(result.getUserId())
                .build();
        return  response;
    }

    @Override
    public void deleteScore(AppScoreDeleteRequest request) {
        ScoreEntity entity = ScoreEntity.builder()
                .mapId(request.getMapId())
                .userId(request.getUserId())
                .build();
        scoreStorage.delete(entity);
    }

    @Override
    public AppReadScoreResponse readScore(AppReadScoreRequest request) {
        ScoreId entity = ScoreId.builder()
                .mapId(request.getMapId())
                .userId(request.getUserId())
                .build();
        ScoreEntity result = scoreStorage.findById(entity).orElseThrow();
        AppReadScoreResponse response = AppReadScoreResponse.builder()
                .mapId(result.getMapId())
                .userId(result.getUserId())
                .time(result.getScore())
                .build();
        return  response;
    }

    @Override
    public AppUpdateScoreResponse updateScore(AppUpdateScoreRequest request) {
        ScoreEntity entity = ScoreEntity.builder()
                .mapId(request.getMapId())
                .userId(request.getUserId())
                .score(request.getScore())
                .build();
        ScoreEntity result = scoreStorage.save(entity);
        AppUpdateScoreResponse response = AppUpdateScoreResponse.builder()
                .mapId(result.getMapId())
                .userId(result.getUserId())
                .build();
        return  response;
    }

    @Override
    public List<AppReadScoreResponse> readAll() {
        
        List<ScoreEntity> result = (List<ScoreEntity>) scoreStorage.findAll();
        if (!result.isEmpty()) {
            return result.stream().map(score -> AppReadScoreResponse.builder()
                .mapId(score.getMapId())
                .userId(score.getUserId())
                .time(score.getScore())
                .build()
            ).toList();
        }
        return List.of();
    }
    
}
