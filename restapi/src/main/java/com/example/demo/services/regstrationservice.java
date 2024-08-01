package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.regstration;
import com.example.demo.repository.registrationrepository;

@Service

//service name is given as modelname+service.
public class regstrationservice {

	@Autowired
	registrationrepository repo;
//	repo is one nickname to call curd operations from repository layer.

//	service layer performs  data insertion to database.
//	(model name ,nickname for model)
//	.save is used to send single data(data should send to database which is present in model layer so reg is used)
//	method except return type
	public regstration addingcustmor(regstration reg) {
		return repo.save(reg);
	}

//	creating another method to insert multiple data
//	list javautil:for multiple data we use list keyword <modelname >nickname for model
	public Iterable<regstration> addingallusers(List<regstration> reg) {
		return repo.saveAll(reg);
//		the above line should be iterateble(change) becoz one after the other data should insert

	}

//	to fetch multiple values list is used.
	public List<regstration> mutlifetch() {
//		type caste to convert to list
		return (List<regstration>) repo.findAll();
	}

	public Optional<regstration> singlefetch(int id) {
//if option suits it will fetch other wise it will not fetch so used opational
		return repo.findById(id);

	}

//	delete operation
	public String deleteid(int id) {

		repo.deleteById(id);
		return "sucessfully deleted" + id;
	}

//	update operation
	public regstration updatedata(regstration re) {
		int id=re.getId();
		regstration reg=repo.findById(id).get();
		reg.setId(re.getId());
		reg.setName(re.getName());
		reg.setEmail(re.getEmail());
		reg.setPassword(re.getPassword());
		return repo.save(reg);
	}
}
