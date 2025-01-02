package com.nye.SokobanEndpoints;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nye.SokobanApp.AppDto.AppResponse.AppMapResponse.ReadMapResponse;

import jakarta.validation.Valid;

@RestController
public class MapEndpoints {

    // @PostMapping("/create_map")
    // MapResponse createMap(){
    //     return new MapResponse();
    // }
    @GetMapping("/read_map/{id}")
    ReadMapResponse readMap(@PathVariable("id") Long id){
        return  new ReadMapResponse();
    }
    // @PutMapping("/update_map/{id}")
    // MapResponse updateMap(@PathVariable("id") Long id, @RequestBody @Valid MapRequest newMap){
    //     return new MapResponse();
    // }
    // @DeleteMapping("/delete_map/{id}")
    // MapResponse deleteMap(@PathVariable("id") Long id){
    //     return new MapResponse();
    // }
}
