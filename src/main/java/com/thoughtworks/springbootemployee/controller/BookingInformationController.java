package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.modal.BookingInformation;
import com.thoughtworks.springbootemployee.service.BookingInformationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingInformationController {
    private final BookingInformationService bookingInformationService;

    public BookingInformationController(BookingInformationService bookingInformationService) {
        this.bookingInformationService = bookingInformationService;
    }

    @PostMapping()
    public BookingInformation createBooking(@RequestBody BookingInformation bookingInformation) {
        return bookingInformationService.create(bookingInformation);
    }
}
