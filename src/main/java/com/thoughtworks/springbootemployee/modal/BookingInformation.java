package com.thoughtworks.springbootemployee.modal;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;

@Entity
public class BookingInformation {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "booking_information_sequence")
    @SequenceGenerator(name = "booking_information_sequence",sequenceName = "booking_information_sequence", allocationSize = 1)
    BigInteger bookingId;
    private String bookingNumber;
    private Integer userId;
    private BigInteger parkingLotId;
    private BigInteger locationId;
    private BigInteger slotId;
    private String reservedDate;
    private Time reservedTime;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private Date creationDate;
    private Boolean isParked;
    private String status;
    private Time leaveTime;

    public BookingInformation() {

    }

    public BookingInformation(Integer userId, BigInteger parkingLotId, BigInteger locationId,
                              BigInteger slotId, String reservedDate, Time reservedTime, Time leaveTime) {
        this.userId = userId;
        this.parkingLotId = parkingLotId;
        this.locationId = locationId;
        this.slotId = slotId;
        this.reservedDate = reservedDate;
        this.reservedTime = reservedTime;
        this.leaveTime = leaveTime;
    }

    public BigInteger getBookingId() {
        return bookingId;
    }

    public void setBookingId(BigInteger bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigInteger getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(BigInteger parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public BigInteger getLocationId() {
        return locationId;
    }

    public void setLocationId(BigInteger locationId) {
        this.locationId = locationId;
    }

    public BigInteger getSlotId() {
        return slotId;
    }

    public void setSlotId(BigInteger slotId) {
        this.slotId = slotId;
    }

    public Time getReservedTime() {
        return reservedTime;
    }

    public void setReservedTime(Time reservedTime) {
        this.reservedTime = reservedTime;
    }

    public Boolean getParked() {
        return isParked;
    }

    public void setParked(Boolean parked) {
        isParked = parked;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Time getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Time leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getReservedDate() {
        return reservedDate;
    }

    public void setReservedDate(String reservedDate) {
        this.reservedDate = reservedDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
