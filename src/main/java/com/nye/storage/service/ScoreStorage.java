package com.nye.storage.service;

import com.nye.storage.entity.ScoreEntity;
import com.nye.storage.entity.ScoreId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreStorage extends CrudRepository<ScoreEntity, ScoreId> {
}
