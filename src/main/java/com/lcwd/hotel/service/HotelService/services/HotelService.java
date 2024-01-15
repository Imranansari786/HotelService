package com.lcwd.hotel.service.HotelService.services;

import com.lcwd.hotel.service.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    public Hotel addHotel(Hotel hotel);
    public List<Hotel> getAllHotel();
    public Hotel getHotel(String hotelId);
    public Hotel updateHotel(Hotel hotel);

}
