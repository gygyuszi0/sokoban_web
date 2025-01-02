package com.nye.SokobanEndpoints;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.CreateMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.UpdateMapRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.CreateMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.DeleteMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.ReadMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.UpdateMapResponse;

import jakarta.validation.Valid;

@RestController
public class MapEndpoints {

    @PostMapping("/create_map")
    CreateMapResponse createMap(@RequestBody @Valid CreateMapRequest newMap){
        return new CreateMapResponse();
    }
    @GetMapping("/read_map/{id}")
    ReadMapResponse readMap(@PathVariable("id") Long id){
        return  new ReadMapResponse();
    }
    @PutMapping("/update_map/{id}")
    UpdateMapResponse updateMap(@PathVariable("id") Long id, @RequestBody @Valid UpdateMapRequest newMap){
        return new UpdateMapResponse();
    }
    @DeleteMapping("/delete_map/{id}")
    DeleteMapResponse deleteMap(@PathVariable("id") Long id){
        return new DeleteMapResponse();
    }
}
