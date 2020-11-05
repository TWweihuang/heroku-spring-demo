package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.modal.BookingInformation;
import com.thoughtworks.springbootemployee.repository.BookingInformationRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingInformationService {
    private BookingInformationRepository bookingInformationRepository;

    public BookingInformationService(BookingInformationRepository bookingInformationRepository) {
        this.bookingInformationRepository = bookingInformationRepository;
    }

    public BookingInformation create(BookingInformation bookingInformation) {
        return bookingInformationRepository.save(bookingInformation);
    }
}
