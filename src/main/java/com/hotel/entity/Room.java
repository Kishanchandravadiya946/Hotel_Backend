package com.hotel.entity;



import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="room")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="id")

public class Room {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="ID")
    private int id;
	@Column(name="room_number")
	private int room_number;
	@Column(name="type")
	private String type;
	@ManyToOne
	@JoinColumn(name="hotel_id")
	private Hotel Hotel;
	
	@OneToOne(cascade= CascadeType.ALL,mappedBy="Room")
	private Reservation Reservation;

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Hotel getHotel() {
		return Hotel;
	}

	public void setHotel(Hotel Hotel) {
		this.Hotel =Hotel;
	}

	public Reservation getReservation() {
		return Reservation;
	}

	public void setReservation(Reservation Reservation) {
		this.Reservation = Reservation;
	}

	@Override
	public String toString() {
		return "room [id=" + id + ", room_number=" + room_number + ", type=" + type + ", Hotel=" + Hotel
				+ ", Reservation=" + Reservation + "]";
	}

	
	

}
