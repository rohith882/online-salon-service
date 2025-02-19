package com.app.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(unique = true, nullable = false)
	private String email;

	@Column(nullable = false)
	private String mobileNo;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String sex;
	
	@Enumerated(EnumType.STRING)
    private Role role;

//	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
//	private List<Booking> bookingHistory;
}
