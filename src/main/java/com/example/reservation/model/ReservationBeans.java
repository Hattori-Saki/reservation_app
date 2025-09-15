package com.example.reservation.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationBeans implements Serializable {
	private static final long serialVersionUID = 1L;

	private int reservation_id;
	private String patient_no;
	private LocalDate reservation_date;
	private LocalTime reservation_time;
	private String reservation_type;
	private String status;

	public int getReservationId() {
		return reservation_id;
	}
	public void setLoginId(int reservation_id) {
		this.reservation_id = reservation_id;
	}
	public String getPatientNo() {
		return patient_no;
	}
	public void setPatientNo(String patient_no) {
		this.patient_no = patient_no;
	}
	public LocalDate getReservationDate() {
		return reservation_date;
	}
	public void setReservationDate(LocalDate reservation_date) {
		this.reservation_date = reservation_date;
	}
	public LocalTime getReservationTime() {
		return reservation_time;
	}
	public void setReservationTime(LocalTime reservation_time) {
		this.reservation_time = reservation_time;
	}
}

