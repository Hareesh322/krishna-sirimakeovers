package com.sirimakeovers.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    public static class BookingRequest {
        public String name;
        public String phone;
        public String date;
        public String serviceType;
    }

    @PostMapping
    public ResponseEntity<String> createBooking(@RequestBody BookingRequest request) {
        System.out.println("[BOOKING] " + LocalDateTime.now() + " - Name: " + request.name + ", Phone: " + request.phone + ", Date: " + request.date + ", Service: " + request.serviceType);
        String resp = "Thanks " + (request.name==null?"Guest":request.name) + ". Your booking request for " + request.serviceType + " on " + request.date + " has been received.";
        return ResponseEntity.ok(resp);
    }
}
