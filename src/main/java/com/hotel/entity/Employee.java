package com.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
	private int id;
    @Column(name="Name")
	private String name;
    
    @Column(name="Email")
	private String Email;
	
    @Column(name="Role")
    private String Role;
   
    @JsonIgnore
	@ManyToOne
	@JoinColumn(name="HotelID")
	private Hotel HotelId;
	public Employee() {
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
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public Hotel getHotelId() {
		return HotelId;
	}
	public void setHotelId(Hotel hotelId) {
		HotelId = hotelId;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", Email=" + Email + ", Role=" + Role + ", HotelId=" + HotelId
				+ "]";
	}
	
	
	
	
	
}
