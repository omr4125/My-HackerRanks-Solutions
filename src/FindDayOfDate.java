import java.time.DayOfWeek;
import java.time.LocalDate;


public class FindDayOfDate {

	public static void main(String[] args) {
		FindDayOfDate.findDay(11, 06, 2021);
	}
	public static String findDay(int month, int day, int year) {
        
		 LocalDate localDate = LocalDate.of(year, month, day);
		 System.out.println(localDate.getDayOfWeek());
		 
		 DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		 System.out.println(dayOfWeek);
		 
		
        return "";
    }
}
