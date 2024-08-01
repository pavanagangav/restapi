package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="`payment`")
public class payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private int total;
    private String cardholdername;
    private long cardnumber;
    private int cvvnumber;
    

}
