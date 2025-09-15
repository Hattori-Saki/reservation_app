package com.example.reservation.model;

import java.io.Serializable;

public class AccountBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	private String patient_no;
	private String name;
	private String phone;
	private String email;
	private String password_hash;
	private String role;

	public String getPatientNo() {
		return patient_no;
	}
	public void setPatientNo(String patient_no) {
		this.patient_no = patient_no;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordHash() {
		return password_hash;
	}
	public void setPasswordHash(String password_hash) {
		this.password_hash = password_hash;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}

