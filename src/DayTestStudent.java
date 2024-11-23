/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: beverage shop 
 * Due: 04/19/2024
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Montana Bazarragchaa
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DayTestStudent {

	   @Test
	    public void testDayEnum() {
	        assertAll(
	            () -> assertNotNull(Day.MONDAY),
	            () -> assertNotNull(Day.TUESDAY),
	            () -> assertNotNull(Day.WEDNESDAY),
	            () -> assertNotNull(Day.THURSDAY),
	            () -> assertNotNull(Day.FRIDAY),
	            () -> assertNotNull(Day.SATURDAY),
	            () -> assertNotNull(Day.SUNDAY)
	        );
	    }
}
