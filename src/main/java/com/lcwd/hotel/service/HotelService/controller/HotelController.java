package com.lcwd.hotel.service.HotelService.controller;

import com.lcwd.hotel.service.HotelService.entities.Hotel;
import com.lcwd.hotel.service.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel/v1/api")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    //create hotel http://localhost:8082/hotel/v1/api/addHotel
    @PostMapping("/addHotel")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1=hotelService.addHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    //create hotel http://localhost:8082/hotel/v1/api/getAllHotel
    @GetMapping("/getAllHotel")
    public ResponseEntity<List<Hotel>> getAllHotels()
    {
        List<Hotel> listOfHotel=hotelService.getAllHotel();
        return ResponseEntity.ok(listOfHotel);
    }
    //create hotel http://localhost:8082/hotel/v1/api/getHotelById/1
    @GetMapping("/getHotelById/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable("hotelId") String hotelId)
    {
        Hotel hotelId1=hotelService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotelId1);
    }
    //create hotel http://localhost:8082/hotel/v1/api/updateHotel
    @PutMapping("/updateHotel")
    public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1=hotelService.updateHotel(hotel);
        return ResponseEntity.ok(hotel1);
    }




}
