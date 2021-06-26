/**
 * ************************** 
 * Purpose: to find the cheapest hotel for given date range
 *                      
 * @author Piyush Shaw
 * @version 1.0
 * @since 26-06-2021
 * **************************
 */

package com.bridgelabz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HotelReservationSystem {
	 /*
	 to add hotels 
	 */
static ArrayList<HotelInfo> hotelInfo=new ArrayList<HotelInfo>();
Scanner scanner = new Scanner(System.in);
HotelInfo hotelReservation;

public void addHotel() {
	hotelInfo.add(new HotelInfo("Lakewood",110, 3));
	hotelInfo.add(new HotelInfo("Bridgewood",160,4));
	hotelInfo.add(new HotelInfo("RidgeWood",220,5));
	hotelInfo.stream().forEach(System.out::println); // taking input from Array
}
/*
 * this method will find the cheapest hotel with rate
 */

public boolean toCheckDate(String dataToReserved,String dateFormat) {
	SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	sdf.setLenient(false);
	try {
		
		String dateToReserved = null;
		Date date =sdf.parse(dateToReserved);
		Calendar currentDateAfter3Months=Calendar.getInstance();
		currentDateAfter3Months.add(Calendar.MONTH,3);
		
		Calendar currentDateBefore3Months=Calendar.getInstance();
		currentDateBefore3Months.add(Calendar.MONTH,-3);
		
		if(date.before(currentDateAfter3Months.getTime()) && date.after(currentDateBefore3Months.getTime())){
			return true;
		} else {
			return false;
		}
	} catch(ParseException e) {
		e.printStackTrace();
		return false;
	}
	}
}
		
		
		
	



