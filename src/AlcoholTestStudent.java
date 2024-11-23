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

class AlcoholTestStudent {
    @Test
    void testCalcPrice() {
        Alcohol alcohol = new Alcohol("Wine", Size.MEDIUM, true);
        assertEquals(3.6, alcohol.calcPrice(), "Check price with weekend surcharge.");
    }

    @Test
    void testToString() {
        Alcohol alcohol = new Alcohol("Wine", Size.SMALL, false);
        assertTrue(alcohol.toString().contains("Wine") && alcohol.toString().contains("SMALL"),
                "String should contain both the name and the size.");
    }

    @Test
    void testEquals() {
        Alcohol alcohol1 = new Alcohol("Wine", Size.SMALL, true);
        Alcohol alcohol2 = new Alcohol("Wine", Size.SMALL, true);
        assertTrue(alcohol1.equals(alcohol2), "Both alcohols should be the same.");
    }
}
