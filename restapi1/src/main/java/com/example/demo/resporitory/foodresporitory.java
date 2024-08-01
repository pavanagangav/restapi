package com.example.demo.resporitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.food;

@Repository
public interface foodresporitory extends CrudRepository<food, Integer> {

	food findByName(String name);

}
