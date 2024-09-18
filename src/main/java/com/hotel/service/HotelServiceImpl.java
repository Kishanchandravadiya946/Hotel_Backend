package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.dao.HotelDAO;
import com.hotel.entity.Hotel;
@Service
public class HotelServiceImpl implements HotelService {
    private  HotelDAO hotelDAO;
    @Autowired
    public HotelServiceImpl(HotelDAO hotelDAO) {
        this.hotelDAO = hotelDAO;
    }

    @Override
    @Transactional
    public List<Hotel> getAllHotels() {
        return hotelDAO.getAllHotels();
    }

    @Override
    @Transactional
    public Hotel getHotelById(int id) {
        return hotelDAO.getHotelById(id);
    }

    @Override
    @Transactional
    public void addHotel(Hotel hotel) {
        hotelDAO.addHotel(hotel);
    }

    @Override
    @Transactional
    public void updateHotel(int id, Hotel hotel) {
        hotelDAO.updateHotel(id, hotel);
    }

    @Override
    @Transactional
    public void deleteHotel(int id) {
        hotelDAO.deleteHotel(id);
    }
}
