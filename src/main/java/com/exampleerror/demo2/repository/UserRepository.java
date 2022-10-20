package com.exampleerror.demo2.repository;


import com.exampleerror.demo2.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
}
