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
@Table(name="reservation")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="id")

public class Reservation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="TotalPrice")
	private int totalprice;
	@OneToOne
	@JoinColumn(name="GuestID")
	private Guest Guest;
	
	@OneToOne
	@JoinColumn(name="RoomID")
	private Room Room;
	
	@ManyToOne
	@JoinColumn(name="HotelID")
	private Hotel Hotel;
	
	@OneToOne(cascade= CascadeType.ALL,mappedBy="Reservation")
	private Payment Payment;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public Guest getGuest() {
		return Guest;
	}

	public void setGuest(Guest Guest) {
		this.Guest = Guest;
	}

	public Room getRoom() {
		return Room;
	}

	public void setRoom(Room Room) {
		this.Room = Room;
	}

	public Hotel getHotel() {
		return Hotel;
	}

	public void setHotel(Hotel Hotel) {
		this.Hotel = Hotel;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}

	@Override
	public String toString() {
		return "reservation [id=" + id + ", totalprice=" + totalprice + ", Guest=" + Guest + ", Room=" + Room
				+ ", Hotel=" + Hotel + ", Payment=" + Payment + "]";
	}
	
	
}
