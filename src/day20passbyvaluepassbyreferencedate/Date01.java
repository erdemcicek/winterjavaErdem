package day20passbyvaluepassbyreferencedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
//import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
		 // Monday 20.00     4 
		 // Tuesday 19.00    5
		 // Wednesday 20.00  4
		 // Tuesday 20.00    4

public class Date01 {

	public static void main(String[] args) {
		
		// How to create date object
		LocalDate currentDate1 = LocalDate.now();// different way of creating object, normally we use constructor and "new"
		
		System.out.println(currentDate1); // 2021-03-07  yyyy-mm-dd
		
		System.out.println(currentDate1.plusDays(5)); //2021-03-12
		
		System.out.println(currentDate1.plusMonths(3)); // 2021-06-07
		
		System.out.println(currentDate1.plusDays(3).plusMonths(2).plusYears(1));// 2022-05-10
		
		System.out.println(currentDate1.getYear()); // 2021
		
		System.out.println(currentDate1.getMonth()); // MARCH
		
		System.out.println(currentDate1.getMonthValue()); // 3
		
		System.out.println(currentDate1.getDayOfMonth()); // 7
		
		System.out.println(currentDate1.getDayOfYear()); // 66  -> 66th day of the year
		
		System.out.println(currentDate1.getDayOfWeek()); // SUNDAY
		
		System.out.println(currentDate1.minusDays(12)); // 2021-02-23
		
		System.out.println(currentDate1.minusMonths(5)); // 2020-10-07
		
		System.out.println(currentDate1.minusYears(2));  // 2019-03-07
		
		System.out.println(currentDate1.minusYears(2).plusMonths(3).minusDays(5)); // 2019-06-02
		
//		currentDate1.isAfter("2019-03-07"); It complains, we have to create another date object
		
		LocalDate date2 = LocalDate.of(2019, 3, 5);
		
		System.out.println(currentDate1.isAfter(date2)); // true   ===> returns boolean
		
		System.out.println(currentDate1.isBefore(date2)); // false ===> returns boolean
		
//		currentDate1.isLeapYear();  returns boolean
		
		// -------------------------------------------------------------------------------
		
		// How to create time object
		
		LocalTime currentTime = LocalTime.now();
		
		System.out.println(currentTime);  // 20:05:19.457709600  hh:mm:ss:ns
		
		System.out.println(currentTime.plusMinutes(11));  // 20:17:44.543177600
		
		
//		System.out.println(currentTime2.getNano() - currentTime1.getNano());  we can find code speed
		
//      I can test other plus-minus methods
//      I can test other get methods
//      I can test isBefore, isAfter methods
		
//		System.out.println(currentTime.now(ZoneId.of("Japan")));
//		System.out.println(currentTime.now(ZoneId.of("Europe/Moscow")));
		
		// How to create an object from LocalDateTime
		
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1); // 2021-03-07T20:21:05.338986100
		
		LocalDate currentDate2 = LocalDate.now();
		System.out.println(currentDate2); // 2021-03-07
		
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd");  // M ==> Months, m ==> minutes
		System.out.println(dtf2.format(currentDate2)); 			/// MMM --> name of the month (first 3 characters)
																/// MM  --> number of the month ( 03-04 etc.)
																/// MMMM--> full name of the month
																/// M   --> number of the month ( 3 - 4  etc.)
		
		LocalTime currentTime2 = LocalTime.now();
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm"); // hh ==> is for am-pm time format
																	   // HH ==> is for 24 hours system
		System.out.println(dtf3.format(currentTime2)); // 08:41	
		System.out.println(dtf3.format(currentTime2) + "pm"); // We may also add String to the pattern
		
		
		// How to find difference between two dates
		LocalDate d1 = LocalDate.now();
		LocalDate bd1 = LocalDate.of(1997, 5, 23);
		
		Period age = Period.between(bd1, d1);
		
		System.out.println(age); // P23Y9M12D ==> 23 years 9 months 12 days
		
		// If you want to get year, month and day in age use the below code
//		Period age2 = Period.between(bd1, d1);
		
		// If you want to get just year in age use the following code
		int ageYear = Period.between(bd1, d1).getYears();
		System.out.println(ageYear); // 23
	}
}
