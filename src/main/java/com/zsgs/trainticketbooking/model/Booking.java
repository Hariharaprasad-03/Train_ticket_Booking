package com.zsgs.trainticketbooking.model;

import com.zsgs.trainticketbooking.enums.BookingStatus;
import com.zsgs.trainticketbooking.enums.PaymentStatus;

public class Booking {

    private String bookingId ;
    private String tripId ;
    private int noOfSeats ;
    private String passengerId ;
    private String userId ;
    private BookingStatus bookingStatus ;
    private String paymentId ;
    private PaymentStatus paymentStatus ;

    public Booking() {
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", tripId='" + tripId + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", passengerId='" + passengerId + '\'' +
                ", userId='" + userId + '\'' +
                ", bookingStatus=" + bookingStatus +
                ", paymentId='" + paymentId + '\'' +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
