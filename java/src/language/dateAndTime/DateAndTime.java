package language.dateAndTime;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

//Date and Time Conversion Characters:
//Character	Description	Example
//c	Complete date and time	Mon May 04 09:51:52 CDT 2009
//F	ISO 8601 date	2004-02-09
//D	U.S. formatted date (month/day/year)	02/09/2004
//T	24-hour time	18:05:19
//r	12-hour time	06:05:19 pm
//R	24-hour time, no seconds	18:05
//Y	Four-digit year (with leading zeroes)	2004
//y	Last two digits of the year (with leading zeroes)	04
//C	First two digits of the year (with leading zeroes)	20
//B	Full month name	February
//b	Abbreviated month name	Feb
//m	Two-digit month (with leading zeroes)	02
//d	Two-digit day (with leading zeroes)	03
//e	Two-digit day (without leading zeroes)	9
//A	Full weekday name	Monday
//a	Abbreviated weekday name	Mon
//j	Three-digit day of year (with leading zeroes)	069
//H	Two-digit hour (with leading zeroes), between 00 and 23	18
//k	Two-digit hour (without leading zeroes), between 0 and 23	18
//I	Two-digit hour (with leading zeroes), between 01 and 12	06
//l	Two-digit hour (without leading zeroes), between 1 and 12	6
//M	Two-digit minutes (with leading zeroes)	05
//S	Two-digit seconds (with leading zeroes)	19
//L	Three-digit milliseconds (with leading zeroes)	047
//N	Nine-digit nanoseconds (with leading zeroes)	047000000
//P	Uppercase morning or afternoon marker	PM
//p	Lowercase morning or afternoon marker	pm
//z	RFC 822 numeric offset from GMT	-0800
//Z	Time zone	PST
//s	Seconds since 1970-01-01 00:00:00 GMT	1078884319
//Q	Milliseconds since 1970-01-01 00:00:00 GMT	1078884319047

public class DateAndTime {

	public static void main(String[] args) {
		// dateClass();
		//
		// try
		// {
		// getDifference(3);
		// }catch(Exception e){}

		// localTime();

		// avilableTimeZone();
		// avilableLocale();
		// calendar();
		milisecond();
	}

	public static void dateClass() {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.format("%tc\n", date);
		System.out.format("%1$tZ  %1$tI:%1$tM %1$tp, %1$tB,%1$td, %1$tY \n",
				date);

	}

	public static void getDifference(int x) throws InterruptedException {

		long start = System.currentTimeMillis();
		System.out.println(new Date() + "\n");
		Thread.sleep(x);
		System.out.println(new Date() + "\n");
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Difference is : " + diff);

	}

	public static void localTime() {
		System.out.printf("now: %s%n", ZoneId.systemDefault());
		System.out.printf("now: %s%n", LocalDateTime.now());
		System.out.printf("now: %s%n", LocalDateTime.now().plusDays(1));
		System.out.printf("now: %s%n", LocalDateTime.now().plusMonths(1));
		System.out.printf("now: %s%n", LocalDateTime.now().minusYears(2));

	}

	public static void avilableTimeZone() {
		String[] availableIDs = TimeZone.getAvailableIDs();

		for (String id : availableIDs) {
			System.out.println(id);
		}
	}

	public static void avilableLocale() {
		Locale list[] = DateFormat.getAvailableLocales();
		for (Locale aLocale : list) {
			System.out.println(aLocale.toString() + " : "
					+ aLocale.getDisplayCountry() + " : "
					+ aLocale.getDisplayName());
		}
	}

	// In Java you can convert between time zones using the java.util.Calendar
	// class.
	public static void calendar() {
		Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"),
				Locale.US);
		System.out.println("안녕");

		calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println("UTC: " + calendar.get(Calendar.HOUR_OF_DAY) + ":"
				+ calendar.get(Calendar.MINUTE));
		// System.out.println("UTC: " + calendar.getTimeInMillis());

		calendar.setTimeZone(TimeZone.getTimeZone("PST"));
		System.out.println("PST: " + calendar.get(Calendar.HOUR_OF_DAY) + ":"
				+ calendar.get(Calendar.MINUTE));
		// System.out.println("CPH: " + calendar.getTimeInMillis());
		//
		calendar.setTimeZone(TimeZone.getTimeZone("Japan"));
		System.out.println("Korea: " + calendar.get(Calendar.HOUR_OF_DAY) + ":"
				+ calendar.get(Calendar.MINUTE));
		// System.out.println("NYC: " + calendar.getTimeInMillis());
	}

	public static void milisecond() {
		System.out.println(System.currentTimeMillis());
	}

}
