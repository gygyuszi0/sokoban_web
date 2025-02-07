package com.nye.storage.service;

import com.nye.storage.entity.MapEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapStorage extends CrudRepository<MapEntity, Long> {
}
