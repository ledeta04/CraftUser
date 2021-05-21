package com.craft.software.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.craft.software.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
    List<User> findByfirstname(String firstname);
    
}
