package com.nye.storage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Score entity.
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;

    /**
     * Score id part 1.
     */
    private Long mapId;

    /**
     * Score id part 2.
     */
    private Long userId;

    /**
     * Score (time).
     */
    @NotNull
    private Float score;
}
