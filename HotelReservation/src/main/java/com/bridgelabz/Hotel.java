package com.bridgelabz;

public class Hotel {
	private String hotelName;
	private int rating;
	private double weekDayregularCustomerCharge;
	private double weekendRegularCustomerCharge;
	
	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public double getWeekDayregularCustomerCharge() {
		return weekDayregularCustomerCharge;
	}
	public void setWeekDayregularCustomerCharge(double weekDayregularCustomerCharge) {
		this.weekDayregularCustomerCharge = weekDayregularCustomerCharge;
	}
	public double getWeekendRegularCustomerCharge() {
		return weekendRegularCustomerCharge;
	}
	public void setWeekendRegularCustomerCharge(double weekendRegularCustomerCharge) {
		this.weekendRegularCustomerCharge = weekendRegularCustomerCharge;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", weekDayregularCustomerCharge="
				+ weekDayregularCustomerCharge + ", weekendRegularCustomerCharge=" + weekendRegularCustomerCharge + "]";
	}
	
	
}
