package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.order;
@Repository
public interface orderrespository extends CrudRepository<order, Integer> {
	

}
