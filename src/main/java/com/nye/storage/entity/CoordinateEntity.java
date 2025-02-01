package com.nye.storage.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Player's start coordinate.
 */
@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CoordinateEntity {

    /**
     * X-coordinate.
     */
    private Integer x;

    /**
     * Y-coordinate.
     */
    private Integer y;
}
