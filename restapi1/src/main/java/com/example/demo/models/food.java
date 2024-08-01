package com.example.demo.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter                  //to post data
@Getter                  // to fetch data
@AllArgsConstructor     //super class constructor
@NoArgsConstructor     //constructor with fields
@Entity  //to create a table
public class food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //to generate the id ay=utomatically and continuous
	private int id;
	private String name;
	private int price;
	private  int quantity;

}
