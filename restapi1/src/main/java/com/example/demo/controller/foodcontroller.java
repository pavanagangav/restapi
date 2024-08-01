package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.food;
import com.example.demo.services.foodservice;
@RestController
@RequestMapping("/api/v1")
public class foodcontroller {
	@Autowired
	foodservice service;
	@PostMapping("/posting")
	public food insertdata(@RequestBody food f) {
		return service.insertdata(f);
	}
	@PostMapping("/postingall")
	public Iterable<food> f(@RequestBody List<food> f) {
		return service.insertall(f);
	}
	@GetMapping("/getall")
	public List<food> getall(){
		return service.getAll();
	}
	@GetMapping("/getbyid/{id}")
	public Optional<food> getbyid(@PathVariable int id) {
		return service.getbyid(id);
	}
	@GetMapping("/findbyname/{name}")
	public food findbyname(@PathVariable String name)
	{
		return service.getbyname(name);
	}
	@DeleteMapping("/deletebyid/{id}")
public String deletebyid(@PathVariable int id) {
	return service.deletebyid(id);
}
}
