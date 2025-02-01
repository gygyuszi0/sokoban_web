package com.nye.storage.entity;

import jakarta.persistence.Entity;
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
@IdClass(ScoreId.class)
public class ScoreEntity {

    /**
     * Score id part 1.
     */
    @Id
    private Long mapId;

    /**
     * Score id part 2.
     */
    @Id
    private Long userId;

    /**
     * Score (time).
     */
    @NotNull
    private Float score;
}
