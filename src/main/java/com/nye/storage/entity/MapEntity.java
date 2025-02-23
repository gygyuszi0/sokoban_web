package com.nye.storage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Content of map.
     */
    @NotNull
    private String mapContent;

    @NotNull
    private String mapName;

    @NotNull
    private Integer widht;
    
    @NotNull
    private Integer height;
}
