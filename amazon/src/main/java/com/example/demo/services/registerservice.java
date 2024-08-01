package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.register;
import com.example.demo.repository.registerrepository;

@Service
public class registerservice {
@Autowired
registerrepository repo;
public register adding(register reg) {
	return repo.save(reg);
}
public Iterable<register> addingall(List<register> reg) {
	return repo.saveAll(reg);
}
public Optional<register> singlefetch(int id) {
			return repo.findById(id);

	}
public List<register> mutlifetch() {
	return (List<register>) repo.findAll();
}
public String deleteid(int id) {
	repo.deleteById(id);
	return "sucessfully deleted" + id;
}
public register updatedata(register reg) {
	int id=reg.getId();
	register r=repo.findById(id).get();
	r.setId(reg.getId());
	r.setName(reg.getName());
	r.setEmail(reg.getEmail());
	r.setPassword(reg.getPassword());
	r.setConfirmpassword(reg.getConfirmpassword());
	return repo.save(r);
}
}
