package com.quiz.booking.bo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.quiz.booking.domain.Booking;
import com.quiz.booking.mapper.BookingMapper;

@Service
public class BookingBO {
	
	@Autowired
	private BookingMapper bookingMapper;
	
	public List<Booking> getBookingList(){
		return bookingMapper.selectBookingList();
	}
	
	public int deleteBookingById(int id) {
		return bookingMapper.deleteBookingById(id);
	}
	
	public void addBooking(String name, LocalDate date, int day, int headcount, String phoneNumber) {
		bookingMapper.insertBooking(name, date, day, headcount, phoneNumber);
	}
	
	//output: booking or null
	public Booking getBookingByName(String name, String phoneNumber){
		//없을 떄: []    있을떄:[booking, booking1]
		List<Booking> bookingList = bookingMapper.selectBookingByName(name, phoneNumber);
		return bookingList.isEmpty() ? null : bookingList.get(bookingList.size()-1);
	}
}
