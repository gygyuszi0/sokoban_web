package com.nye.storage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

/**
 * Map entity.
 */
@Builder
@Data
@Entity
public class MapEntity {

    /**
     * Id of map.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Content of map.
     */
    @NotNull
    private String mapContent;

    /**
     * X coordinate of player.
     */
    @NotNull
    private Integer startCoordinateX;

    @NotNull
    private Integer startCoordinateY;
}
