package com.hotel.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.Employee;
import com.hotel.entity.Guest;
import com.hotel.entity.Hotel;
import com.hotel.entity.Payment;
import com.hotel.entity.Reservation;
import com.hotel.entity.Room;
import com.hotel.service.EmployeeService;
import com.hotel.service.GuestService;
import com.hotel.service.HotelService;
import com.hotel.service.PaymentService;
import com.hotel.service.ReservationService;
import com.hotel.service.RoomService;

@RestController
@RequestMapping("/api")
public class HotelRestController {
	
//	private hotelservice hotelser;
	private EmployeeService employeeService;
	private GuestService guestService;
	private HotelService hotelService;
	private PaymentService paymentService;
    private ReservationService reservationService;
    private RoomService roomService;
	@Autowired
	public HotelRestController(EmployeeService employeeService,GuestService guestService,
			HotelService hotelService,PaymentService paymentService,
			ReservationService reservationService,RoomService roomService) {
		
		this.employeeService= employeeService;
		this.guestService=guestService;
		this.hotelService=hotelService;
		this.paymentService=paymentService;
		this.reservationService=reservationService;
		this.roomService=roomService;
	}

//    FOR EMPLOYEE
    @GetMapping("/Employee")
    public List<Employee> getallemployee(){
    	return  employeeService.getAllEmployees();
    }
    @GetMapping("/Employee/{id}")
    public Employee getemployee(@PathVariable int id) {
    	return employeeService.getEmployeeById(id);
    }
    
    @PostMapping("/Employee")
    public void addhotel(@RequestBody Employee employee) {
    	employeeService.addEmployee(employee);
    }
    @PutMapping("/Employee/{id}")
    public void updatehotel(@PathVariable int id,@RequestBody Employee employee) {
    	employeeService.updateEmployee(id, employee);
    }
    @DeleteMapping("/Employee/{id}")
    public void delete(@PathVariable int id) {
    	employeeService.deleteEmployee(id);
    }
    
//    FOR GUEST
    @GetMapping("/Guest")
    public List<Guest> getallguest(){
    	return  guestService.getAllGuests();
    }
    @GetMapping("/Guest/{id}")
    public Guest getguest(@PathVariable int id) {
    	return guestService.getGuestById(id);
    }
    
    @PostMapping("/Guest")
    public void addhotel(@RequestBody Guest guest) {
    	guestService.addGuest(guest);
    }
    @PutMapping("/Guest/{id}")
    public void updatehotel(@PathVariable int id,@RequestBody Guest guest) {
    	guestService.updateGuest(id, guest);
    }
    @DeleteMapping("/Guest/{id}")
    public void deleteguest(@PathVariable int id) {
    	guestService.deleteGuest(id);
    }
    
//    FOR HOTEL
    @GetMapping("/Hotel")
    public List<Hotel> getallhotel(){
    	return  hotelService.getAllHotels();
    }
    @GetMapping("/Hotel/{id}")
    public Hotel gethotel(@PathVariable int id) {
    	return hotelService.getHotelById(id);
    }
    
    @PostMapping("/Hotel")
    public void addhotel(@RequestBody Hotel guest) {
    	hotelService.addHotel(guest);
    }
    @PutMapping("/Hotel/{id}")
    public void updatehotel(@PathVariable int id,@RequestBody Hotel guest) {
    	hotelService.updateHotel(id, guest);
    }
    @DeleteMapping("/Hotel/{id}")
    public void deleteHotel(@PathVariable int id) {
    	hotelService.deleteHotel(id);
    }
    
//    FOR PAYMENT
    
    @GetMapping("/Payment")
    public List<Payment> getallPayment(){
    	return  paymentService.getAllPayments();
    }
    @GetMapping("/Payment/{id}")
    public Payment getPayment(@PathVariable int id) {
    	return paymentService.getPaymentById(id);
    }
    
    @PostMapping("/Payment")
    public void addPayment(@RequestBody Payment payment) {
    	paymentService.addPayment(payment);
    }
    @PutMapping("/Payment/{id}")
    public void updatePayment(@PathVariable int id,@RequestBody Payment payment) {
    	paymentService.updatePayment(id, payment);
    }
    @DeleteMapping("/Payment/{id}")
    public void deletePayment(@PathVariable int id) {
    	paymentService.deletePayment(id);
    }
    
    
//    FOR RESERVATION/
    @GetMapping("/Reservation")
    public List<Reservation> getallReservation(){
    	return  reservationService.getAllReservations();
    }
    @PostMapping("/Reservation")
    public void addPayment(@RequestBody Reservation reservation) {
    	reservationService.addReservation(reservation);
    }
    @DeleteMapping("/Reservation/{id}")
    public void deleteReservation(@PathVariable int id) {
    	reservationService.deleteReservation(id);
    }
    
//    FOR ROOM
    
    @GetMapping("/Room")
    public List<Room> getallroom(){
    	return  roomService.getAllRooms();
    }
    @GetMapping("/Room/{id}")
    public Room getRoom(@PathVariable int id) {
    	return roomService.getRoomById(id);
    }
    
    @PostMapping("/Room")
    public void addRoom(@RequestBody Room room) {
    	roomService.addRoom(room);
    }
    
    @DeleteMapping("/Room/{id}")
    public void deleteRoom(@PathVariable int id) {
    	roomService.deleteRoom(id);
    }
    
}
