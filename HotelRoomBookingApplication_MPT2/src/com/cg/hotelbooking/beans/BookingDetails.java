package com.cg.hotelbooking.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookindetails")
public class BookingDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String customerName;
	@Column
	private Date toDate;
	@Column
	private Date fromDate;
	@Column
	private int noOfRooms;
	
	@OneToOne
	@JoinColumn(name="id")
	private HotelDetails hotelDetails;
	
	
	public BookingDetails() {
		super();
	}
	
	public BookingDetails(int id, String customerName, Date toDate,
			Date fromDate, int noOfRooms, HotelDetails hotelDetails) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.noOfRooms = noOfRooms;
		this.hotelDetails = hotelDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public HotelDetails getHotelDetails() {
		return hotelDetails;
	}

	public void setHotelDetails(HotelDetails hotelDetails) {
		this.hotelDetails = hotelDetails;
	}

	@Override
	public String toString() {
		return "BookingDetails [id=" + id + ", customerName=" + customerName
				+ ", toDate=" + toDate + ", fromDate=" + fromDate
				+ ", noOfRooms=" + noOfRooms + ", hotelDetails=" + hotelDetails
				+ "]";
	}
	
	
}
