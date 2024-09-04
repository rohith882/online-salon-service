package com.app.entity;

//import java.math.BigInteger;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//public class User {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//
//	private String email;
//	private String password;
//	private String address;
//	private BigInteger mobile_No;
//
//	@Enumerated(EnumType.STRING)
//	private Gender gender;
//
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "staff_id") // Ensure this column name matches the one in the database
//	private Staff staff;
//
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "role_id", nullable = false)
//	private Role role_name;
//}
