package com.app.entity;

import java.util.ArrayList;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String details;
	private Double price;

	@Enumerated(EnumType.STRING)
	private Gender gender;

//	private Long service_id;
//
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="fk_user_id")
//	private List<User> userList = new ArrayList<>();


}
