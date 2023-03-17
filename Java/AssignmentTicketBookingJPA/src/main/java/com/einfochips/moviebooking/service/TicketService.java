package com.einfochips.moviebooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.einfochips.moviebooking.model.Ticket;
import com.einfochips.moviebooking.repo.TicketRepository;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepo;
	
	public Integer getBookedSeats(String movieName, String showDate, String showTime, String seatType) {
		Integer bookedSeats = ticketRepo.getAvailableSeat(movieName, showDate, showTime, seatType);
		return bookedSeats != null ? bookedSeats:0;
	}
	
	public Ticket bookTicket(@ModelAttribute Ticket ticket) {
		return ticketRepo.save(ticket);
	}
	
	public Ticket bookedTicket(int tid, String seattype, String paymenttype, String transactionid) {
		
		String amount = "";
		if(paymenttype.equals("150")) {
			amount = "150";
		}
		else {
			amount = "250";
		}
		
		Ticket t = ticketRepo.findById(tid).get();
		t.setPaymentType(paymenttype);
		t.setPaidamount(amount);
		t.setTrasactionId(transactionid);
		t.setStatus("Confirmed");
		
		return ticketRepo.save(t);
	}
}
