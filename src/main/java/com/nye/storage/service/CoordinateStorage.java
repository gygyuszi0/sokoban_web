package com.nye.storage.service;

import com.nye.storage.entity.CoordinateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinateStorage extends CrudRepository<CoordinateEntity, Long> {
}
