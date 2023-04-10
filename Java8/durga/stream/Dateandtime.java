package Java8.durga.stream;

import java.time.LocalDate;
import java.time.LocalTime;

public class Dateandtime {
	public static void main(String[] args) {
		
		LocalDate date= LocalDate.now();
		System.out.println(date);
		int dd=date.getMonthValue();
		int mm = date.getMonthValue();
		int yy = date.getYear();
	 
		
		System.out.println(dd+"..."+mm+"..."+yy);
		System.out.printf("%d-%d-%d",dd,mm,yy);
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
//		
	}

}
