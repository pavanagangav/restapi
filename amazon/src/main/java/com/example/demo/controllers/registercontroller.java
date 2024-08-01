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

import com.example.demo.models.register;

import com.example.demo.services.registerservice;


@RestController
@RequestMapping("/api/v3")
//@CrossOrigin("http://localhost:4200")
public class registercontroller {
	@Autowired
	registerservice service;
	@PostMapping("/add")
	public register insertion(@RequestBody register reg) {
		return service.adding(reg);
	}
	@PostMapping("/multiadd")
	public Iterable<register> multipleinsertion(@RequestBody List<register> reg) {
		return service.addingall(reg);
	}
	@GetMapping("/multifetching")
	public List<register> multifetch() {
		return service.mutlifetch();
	}
	@GetMapping("/singlefetching/{id}")
	public Optional<register> singlefetch(@PathVariable int id) {
		return service.singlefetch(id);
	}
	@DeleteMapping("/deleting/{id}")
	public String deleteid(@PathVariable int id) {
		return service.deleteid(id);
	}
	@PutMapping("/update")
	public register updatedata( @RequestBody  register reg) {
		return service.updatedata(reg);
		
	}

}
