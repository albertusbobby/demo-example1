package com.example.demoexample1.repository;

import com.example.demoexample1.entity.UserApp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserAppRepository extends CrudRepository<UserApp, Long> {
}
