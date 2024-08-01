package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.order;
import com.example.demo.repository.orderrespository;

@Service
public class orderservice {
@Autowired
orderrespository repo;
public order adding(order ord) {
	return repo.save(ord);
}
public Iterable<order> addingall(List<order> ord) {
	return repo.saveAll(ord);
}
public Optional<order> singlefetch(int id) {
			return repo.findById(id);

	}
public List<order> mutlifetch() {
	return (List<order>) repo.findAll();
}
public String deleteid(int id) {
	repo.deleteById(id);
	return "sucessfully deleted" + id;
}
public order updatedata(order ord) {
	int id=ord.getId();
	order o=repo.findById(id).get();
	o.setId(ord.getId());
	o.setName(ord.getName());
	o.setAdress(ord.getAdress());
	o.setEmail(ord.getEmail());
	o.setAmount(ord.getAmount());
	return repo.save(o);
}
}
