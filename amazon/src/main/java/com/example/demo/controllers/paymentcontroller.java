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

import com.example.demo.models.payment;

import com.example.demo.services.paymentservices;


@RestController
@RequestMapping("/api/v4")
//@CrossOrigin("http://localhost:4200")
public class paymentcontroller {
	@Autowired
	paymentservices service;
	@PostMapping("/add")
	public payment insertion(@RequestBody payment pay) {
		return service.adding(pay);
	}
	@PostMapping("/multiadd")
	public Iterable<payment> multipleinsertion(@RequestBody List<payment> pay) {
		return service.addingall(pay);
	}
	@GetMapping("/multifetching")
	public List<payment> multifetch() {
		return service.mutlifetch();
	}
	@GetMapping("/singlefetching/{id}")
	public Optional<payment> singlefetch(@PathVariable int id) {
		return service.singlefetch(id);
	}
	@DeleteMapping("/deleting/{id}")
	public String deleteid(@PathVariable int id) {
		return service.deleteid(id);
	}
	@PutMapping("/update")
	public payment updatedata( @RequestBody  payment pay) {
		return service.updatedata(pay);
		
	}

}
