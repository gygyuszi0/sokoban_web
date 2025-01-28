package com.nye.SokobanApp.AppDto.AppRequest.AppMapRequest;

import com.nye.SokobanApp.AppDto.AppGetter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReadMapRequest {
    private Long id;
}
