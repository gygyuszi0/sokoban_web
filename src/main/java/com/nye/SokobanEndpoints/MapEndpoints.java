package com.nye.SokobanEndpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.CreateMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.DeleteMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.ReadMapRequest;
import com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest.UpdateMapRequest;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.CreateMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.ReadMapResponse;
import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.UpdateMapResponse;
import com.nye.SokobanApp.AppInterface.AppMapInterface;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/map")
public class MapEndpoints {

    @Autowired
    private AppMapInterface mapService;

    @PostMapping("/create")
    CreateMapResponse createMap(@RequestBody @Valid CreateMapRequest newMap){
        return mapService.createMap(newMap);
    }
    @GetMapping("/read/{id}")
    ReadMapResponse readMap(@PathVariable("id") Long id){
        ReadMapRequest readMapRequest = ReadMapRequest.builder().id(id).build();
        return  mapService.readMap(readMapRequest);
    }
    @PutMapping("/update/{id}")
    UpdateMapResponse updateMap(@PathVariable("id") Long id, @RequestBody @Valid UpdateMapRequest newMap){
        newMap.setId(id);
        return mapService.updateMap(newMap);
    }
    @DeleteMapping("/delete/{id}")
    void deleteMap(@PathVariable("id") Long id){
        DeleteMapRequest request = DeleteMapRequest.builder().id(id).build();
        mapService.deleteMap(request);
    }
}
