package com.nye.storage.service;

import com.nye.storage.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStorage extends CrudRepository<UserEntity, Long> {
}
