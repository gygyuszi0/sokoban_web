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
 * Usert tároló adatszerkezet.
 *
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserEntity {

    /**
     * User id.
     */
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * User name.
     */
    @NotNull
    private String userName;

    /**
     * Real name.
     */
    @NotNull
    private String realName;

    /**
     * Password.
     */
    @NotNull
    private String password;

}
