import java.time.*;
import java.time.format.DateTimeFormatter;
class datetime 
{
	public static void main(String[] args) 
	{
		//to display the current date
		LocalDate ld=LocalDate.now();
		System.out.println(ld);

		//to display the date by adding 100 days to current date
		LocalDate ld1=ld.plusDays(100);
		System.out.println(ld1);
		
		//subtract weeks
		LocalDate ld2=ld.minusWeeks(1);
		System.out.println(ld2);

		//to display the current time
		LocalTime lm=LocalTime.now();
		System.out.println(lm);

		//to display the date and time with timezone information
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);

		//to display local date and time
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);

		// creating specific dates
		LocalDate ldd=LocalDate.of(2002,5,4);
		System.out.println(ldd);

		//creating specific time
		LocalTime ltt=LocalTime.of(11,0);
		System.out.println(ltt);
		
		//to calculate any persons age
		Period age=Period.between(LocalDate.of(2003,02,11),LocalDate.now());
		System.out.println(age);
		System.out.println(age.getYears());
		System.out.println(age.getMonths());
		System.out.println(age.getDays());

		//to calculate duration
		Duration time=Duration.between(Instant.now(),Instant.now().plusSeconds(3600));
		System.out.println(time);
		
		//Date and time formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        // Now use it to parse the string
        LocalDateTime parsedDateTime = LocalDateTime.parse("11-04-2025 15:45", formatter);

        // Output
        System.out.println("Parsed DateTime: " + parsedDateTime); 
	}
}
