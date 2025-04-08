package com.nye.storage.service;

import com.nye.storage.entity.ScoreEntity;
import com.nye.storage.entity.ScoreId;

import jakarta.persistence.OrderBy;

import java.util.stream.Stream;

import org.junit.jupiter.api.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreStorage extends CrudRepository<ScoreEntity, ScoreId> {

    @Override
    @OrderBy("id")
    Iterable<ScoreEntity> findAll();
}
