package datetimeAPI.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Date d=new Date();
//		System.out.println(d);
		
//		LocalDate d1=LocalDate.now();
//		System.out.println(d1);
//		
//		int dd=d1.getDayOfMonth();
//		System.out.println(dd);
//		
//		int mm=d1.getDayOfYear();
//		System.out.println(mm);
		
//		int dd=d1.getDayOfMonth();
//		System.out.println(dd);
		
		LocalTime l=LocalTime.now();
		System.out.println(l);
		
		int h=l.getHour();
		System.out.println(h);
		
		LocalDateTime ld=LocalDateTime.now();
		System.out.println(ld);
		
		
	}

}
