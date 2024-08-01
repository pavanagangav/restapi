package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.login;

import com.example.demo.services.loginservice;


@RestController
@RequestMapping("/api/v2")
//@CrossOrigin("http://localhost:4200")
public class logincontroller {
	@Autowired
	loginservice service;
	@PostMapping("/add")
	public login insertion(@RequestBody login log) {
		return service.adding(log);
	}
	@PostMapping("/multiadd")
	public Iterable<login> multipleinsertion(@RequestBody List<login> log) {
		return service.addingall(log);
	}
	@GetMapping("/multifetching")
	public List<login> multifetch() {
		return service.mutlifetch();
	}
	@GetMapping("/singlefetching/{id}")
	public Optional<login> singlefetch(@PathVariable int id) {
		return service.singlefetch(id);
	}
	@DeleteMapping("/deleting/{id}")
	public String deleteid(@PathVariable int id) {
		return service.deleteid(id);
	}
	@PutMapping("/update")
	public login updatedata( @RequestBody  login log) {
		return service.updatedata(log);
		
	}

}
