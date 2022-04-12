package com.bridgelabz;

import java.util.ArrayList;

public class HotelReservation{
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	void display() {
		System.out.println(hotelList);
	}

	public void add(String hotelName, int rating, double WeekDayregularCustomerCharge, double WeekendRegularCustomerCharge) {
		Hotel hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setRating(rating);
		hotel.setWeekDayregularCustomerCharge(WeekDayregularCustomerCharge);
		hotel.setWeekendRegularCustomerCharge(WeekendRegularCustomerCharge);
		hotelList.add(hotel);
	}
}
