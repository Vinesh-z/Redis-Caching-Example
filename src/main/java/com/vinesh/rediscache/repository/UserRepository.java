package com.vinesh.rediscache.repository;

import org.springframework.data.repository.CrudRepository;

import com.vinesh.rediscache.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
