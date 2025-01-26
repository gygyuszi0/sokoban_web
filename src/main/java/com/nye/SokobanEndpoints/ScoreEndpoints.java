package com.nye.SokobanEndpoints;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppCreateScoreRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppCreateScoreResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppReadScoreResponse;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppReadScoreRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppUpdateScoreRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppScoreResponse.AppUpdateScoreRespons;
import com.nye.SokobanApp.AppDto.AppRequest.AppScoreRequest.AppDeleteScoreRequest;




@RestController
@RequestMapping("/score")
public class ScoreEndpoints {

    @PostMapping("/create")
    public AppCreateScoreResponse createScore(@RequestBody AppCreateScoreRequest score) {
        // TODO: implement logic to create a new score
        return new AppCreateScoreResponse();
    }

    @GetMapping("/read/{id}")
    public AppReadScoreResponse readScore(@PathVariable Long id) {
        // TODO: implement logic to read a score
        return new AppReadScoreResponse();
    }

    @PutMapping("/update/{id}")
    public AppReadScoreResponse updateScore(@PathVariable Long id, @RequestBody AppUpdateScoreRequest score){
        // TODO: implement logic to update a score
        return new AppReadScoreResponse();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteScore(@PathVariable Long id) {
        // TODO: implement logic to delete a score
    }
        
}
