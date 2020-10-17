package com.example.demoexample1.repository;

import com.example.demoexample1.entity.LogTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogTransactionRepository extends CrudRepository<LogTransaction, String> {
}
