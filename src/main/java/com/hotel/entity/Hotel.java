package com.hotel.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	@Column(name="rating")
	private int rating;
	@OneToMany(cascade = CascadeType.ALL,mappedBy="Hotel")
	private List<Room> Rooms;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy="HotelId")
	
	private List<Employee> Employees;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="Hotel")
	private List<Reservation> Reservations;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public List<Room> getRooms() {
		return Rooms;
	}

	public void setRooms(List<Room> Rooms) {
		this.Rooms = Rooms;
	}

	public List<Employee> getEmployees() {
		return Employees;
	}

	public void setEmployees(List<Employee> Employees) {
		this.Employees = Employees;
	}

	public List<Reservation> getReservations() {
		return Reservations;
	}

	public void setReservations(List<Reservation> Reservations) {
		this.Reservations = Reservations;
	}

	@Override
	public String toString() {
		return "hotel [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", rating=" + rating
				+ ", Rooms=" + Rooms + ", employees=" + Employees + ", Reservations=" + Reservations + "]";
	}
	
	
	

}
