package com;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LocalDate d=LocalDate.now();
//		
//		LocalDate l=LocalDate.of(1999, Month.OCTOBER, 27);
//		System.out.println(d);
//		System.out.println(l);
//		
//		LocalTime lt=LocalTime.now();
//		System.out.println(lt);
//		
//		LocalTime lt1=LocalTime.of(6,07,15,888);
//		System.out.println(lt1);
//		
//		for(String s:ZoneId.getAvailableZoneIds())
//		{
//			System.out.println(s);
//		}
		
//		LocalTime lt2=LocalTime.now(ZoneId.of("GMT"));
//		System.out.println(lt2);

		
		//human readable
		LocalDateTime ld=LocalDateTime.now();
		System.out.println(ld);
		
		//machinereadable
		Instant i=Instant.now();
		System.out.println(i);
	}

}
