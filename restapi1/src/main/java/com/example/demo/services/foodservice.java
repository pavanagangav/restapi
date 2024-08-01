package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.food;
import com.example.demo.resporitory.foodresporitory;

@Service
public class foodservice {
	
@Autowired
foodresporitory repo;
public food insertdata(food f) {
	return repo.save(f);
}

public Iterable<food> insertall(List<food > f)
{
	return repo.saveAll(f);
}
public List<food> getAll(){
	return (List<food>) repo.findAll();
}
public Optional<food> getbyid(int id) {
	return repo.findById(id);
}

//own method it can be any method like email
public food getbyname(String name) {
	return repo.findByName(name);
}
public String deletebyid(int id) {
	 repo.deleteById(id);
	 return "succesfully deleted" + id;
}
}
