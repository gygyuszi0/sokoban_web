package com.nye.SokobanEndpoints;

import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppScoreDeleteRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppUpdateScoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppCreateScoreRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppCreateScoreResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppReadScoreResponse;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppReadScoreRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppUpdateScoreRequest;
import com.nye.SokobanApp.AppInterface.AppScoreInterface;




@RestController
@RequestMapping("/score")
public class ScoreEndpoints {

    @Autowired
    private AppScoreInterface scoreService;

    @PostMapping("/create")
    public AppCreateScoreResponse createScore(@RequestBody AppCreateScoreRequest score) {
        return scoreService.createScore(score);
    }

    @GetMapping("/read/{map_id}/{user_id}")
    public AppReadScoreResponse readScore(@PathVariable Long map_id, @PathVariable Long user_id) {
        AppReadScoreRequest request = AppReadScoreRequest.builder().mapId(map_id).userId(user_id).build();
        return scoreService.readScore(request);
    }

    @PutMapping("/update/{map_id}/{user_id}")
    public AppUpdateScoreResponse updateScore(@PathVariable Long map_id, @PathVariable Long user_id, @RequestBody AppUpdateScoreRequest score) {
        score.setMapId(map_id);
        score.setUserId(user_id);
        return scoreService.updateScore(score);
    }

    @DeleteMapping("/delete/{map_id}/{user_id}")
    public void deleteScore(@PathVariable Long map_id, @PathVariable Long user_id) {
        AppScoreDeleteRequest request = AppScoreDeleteRequest.builder().mapId(map_id).userId(user_id).build();
        scoreService.deleteScore(request);
    }
        
}
