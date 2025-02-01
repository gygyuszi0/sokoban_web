package com.nye.storage.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Map entity.
 */
@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MapEntity {

    /**
     * Id of map.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Content of map.
     */
    @NotNull
    private String mapContent;

    /**
     * Start coordinate of player.
     */
    @NotNull
    @Embedded
    private CoordinateEntity startCoordinate;

}
