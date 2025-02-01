package com.nye.storage.entity;

import jakarta.persistence.*;
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
     * Id of coordinate.
     */
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * X-coordinate.
     */
    private Integer x;

    /**
     * Y-coordinate.
     */
    private Integer y;
}
