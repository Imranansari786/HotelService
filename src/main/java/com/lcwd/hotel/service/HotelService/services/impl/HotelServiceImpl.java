package com.lcwd.hotel.service.HotelService.services.impl;

import com.lcwd.hotel.service.HotelService.entities.Hotel;
import com.lcwd.hotel.service.HotelService.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.service.HotelService.repository.HotelRepository;
import com.lcwd.hotel.service.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel addHotel(Hotel hotel)
    {
        String hotelId= UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String hotelId) {
        return hotelRepository.findById(hotelId)
                .orElseThrow(()-> new ResourceNotFoundException("Hotel Id Not Found with Service "));
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
