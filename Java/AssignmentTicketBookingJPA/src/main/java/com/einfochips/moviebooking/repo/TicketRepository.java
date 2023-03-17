package com.einfochips.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.einfochips.moviebooking.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{
	@Query("SELECT SUM(t.numberofseats) FROM Ticket t where t.movieName=?1 AND t.showDate=?2 AND t.showTime=?3 AND t.seatType=?4")
	public Integer getAvailableSeat (String movieName, String showDate, String showTime, String seatType);
	
	
}
