package com.bridgelabz;

public class HotelReservationMain {
	public static void main(String[] args) {

		System.out.println("Welcome to Hotel Reservation System");
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.add("LakeWood", 3, 110.0, 90.0);
		hotelReservation.add("BridgeWood", 4, 16.0, 60.0);
		hotelReservation.add("RidgeWood", 5, 220.0, 150.0);
		hotelReservation.display();
	}
}
