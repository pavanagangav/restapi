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

import com.example.demo.models.order;

import com.example.demo.services.orderservice;


@RestController
@RequestMapping("/api/v1")
//@CrossOrigin("http://localhost:4200")
public class ordercontroller {
	@Autowired
	orderservice service;
	@PostMapping("/add")
	public order insertion(@RequestBody order ord) {
		return service.adding(ord);
	}
	@PostMapping("/multiadd")
	public Iterable<order> multipleinsertion(@RequestBody List<order> ord) {
		return service.addingall(ord);
	}
	@GetMapping("/multifetching")
	public List<order> multifetch() {
		return service.mutlifetch();
	}
	@GetMapping("/singlefetching/{id}")
	public Optional<order> singlefetch(@PathVariable int id) {
		return service.singlefetch(id);
	}
	@DeleteMapping("/deleting/{id}")
	public String deleteid(@PathVariable int id) {
		return service.deleteid(id);
	}
	@PutMapping("/update")
	public order updatedata( @RequestBody  order ord) {
		return service.updatedata(ord);
		
	}

}
