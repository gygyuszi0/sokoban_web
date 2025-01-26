package com.nye.SokobanApp.AppDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.nye.SokobanApp.AppDto.AppScoreId;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppScoreWithId extends AppScoreId {
    Float time;
}
