/**
 * ************************** 
 * Purpose: Hotel Name And Rate for regular customer 
 *                      
 * @author Piyush Shaw
 * @version 1.0
 * @since 26-06-2021
 * **************************
 */

package com.bridgelabz;

import java.util.ArrayList;

public class HotelReservationSystem {
	 /*
	 to add hotels 
	 */
static ArrayList<HotelInfo> hotelInfo=new ArrayList<HotelInfo>();

public static void addHotelNameAndRateForRegularCustomer() {
	hotelInfo.add(new HotelInfo("Lakewood",110));
	hotelInfo.add(new HotelInfo("Bridgewood",160));
	hotelInfo.add(new HotelInfo("RidgeWood",220));
	hotelInfo.stream().forEach(System.out::println); // taking input from Array
}

public static void main(String[] args) {
	System.out.println("Welcome to Hotel Reservation System");
	addHotelNameAndRateForRegularCustomer();
}
}
