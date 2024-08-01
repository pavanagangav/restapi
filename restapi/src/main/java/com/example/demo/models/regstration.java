package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.Email;
//first layer (models) here what are required for database
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@data contains all annotations  but it decreses perfomance.
//annotations(@) used for all columns to get setters,getters,constructors
//to send data getters is used
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//above:to create table entity is used
public class regstration {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
@Email
private String email;
private String password;
	

}
