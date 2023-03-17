package com.einfochips.moviebooking.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Ticket {
	public int numOfTotalSeats = 400;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int ticketID;
	private String mobileNumber;
	private String movieName;
	private String bookingDate;
	private String showDate;
	private String showTime;
	private int numberofseats;
	private String seatType;
	private String paymentType;
	private String trasactionId;
	private String paidamount;
	private String status;
	public int getTicketID() {
		return ticketID;
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getShowDate() {
		return showDate;
	}
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public int getNumberofseats() {
		return numberofseats;
	}
	public void setNumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getTrasactionId() {
		return trasactionId;
	}
	public void setTrasactionId(String trasactionId) {
		this.trasactionId = trasactionId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaidamount() {
		return paidamount;
	}
	public void setPaidamount(String paidamount) {
		this.paidamount = paidamount;
	}
	public Ticket(int ticketID, String mobileNumber, String movieName, String bookingDate, String showDate,
			String showTime, int numberofseats, String seatType, String paymentType, String trasactionId, String status,
			String paidamount) {
		super();
		this.ticketID = ticketID;
		this.mobileNumber = mobileNumber;
		this.movieName = movieName;
		this.bookingDate = bookingDate;
		this.showDate = showDate;
		this.showTime = showTime;
		this.numberofseats = numberofseats;
		this.seatType = seatType;
		this.paymentType = paymentType;
		this.trasactionId = trasactionId;
		this.status = status;
		this.paidamount = paidamount;
	}
	public Ticket() {
		super();
	}
	@Override
	public String toString() {
		return "Ticket [ticketID=" + ticketID + ", mobileNumber=" + mobileNumber + ", movieName=" + movieName
				+ ", bookingDate=" + bookingDate + ", showDate=" + showDate + ", showTime=" + showTime
				+ ", numberofseats=" + numberofseats + ", seatType=" + seatType + ", paymentType=" + paymentType
				+ ", trasactionId=" + trasactionId + ", status=" + status + ", paidamount=" + paidamount + "]";
	}
	
	
}
