package com.einfochips.moviebooking.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.moviebooking.model.Ticket;
import com.einfochips.moviebooking.repo.TicketRepository;
import com.einfochips.moviebooking.service.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/bookingform")
	public ModelAndView getForm() {
		return new ModelAndView("bookingform").addObject("check",null);
	}
	
	@PostMapping("/payment")
	public ModelAndView getPayment(@RequestParam int tid, String seattype, String paymenttype, String transactionid) {
		ModelAndView mav = new ModelAndView("success");
		
		Ticket t = ticketService.bookedTicket(tid, seattype, paymenttype, transactionid);
		
		
		return mav.addObject("t", t);
	}
	
	@PostMapping("/check")
	public ModelAndView getCheck(@RequestParam String mobileNumber, String moviename, String showdate, String showtime, String movietype, int numberOfTickets) {
		Ticket t = new Ticket(0, mobileNumber, moviename, new Date().toString(), showdate, showtime, numberOfTickets, movietype, "", "", "", "");
		boolean check = true;
		int totalSeats = 0;
		
		if(movietype.equalsIgnoreCase("150")) {
			totalSeats = 300;
		}
		else if(movietype.equalsIgnoreCase("250")) {
			totalSeats = 100;
		}
		else {
			return new ModelAndView("bookingform");
		}

		Integer num = ticketService.getBookedSeats(moviename, showdate, showtime, movietype);
		int avilableSeat = totalSeats - num;
		
		if(avilableSeat<numberOfTickets) {
			check = false;
			return new ModelAndView("bookingform").addObject("check",check);
		}
		else {
			t = ticketService.bookTicket(t);
			return new ModelAndView("payment").addObject("t",t);
		}
	}
	
	
}
