package CollectionsCncpt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDateCncpt {
	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		LocalTime time= LocalTime.now();
		LocalDateTime dateTime= LocalDateTime.now();
		
		System.out.println("Date: "+date+" | Time: "+time+" | DateTime: "+dateTime);
		
		DateTimeFormatter newformat=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		String formatted=dateTime.format(newformat);
		System.out.println("Formatted DateTime: "+formatted);
		
	}
}
