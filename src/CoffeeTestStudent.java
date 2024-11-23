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

class CoffeeTestStudent {

    @Test
    void testCalcPrice() {
        Coffee coffee = new Coffee("Cappuccino", Size.MEDIUM, true, true);
        assertEquals(4.0, coffee.calcPrice(), "Check price with extras.");
    }

    @Test
    void testToString() {
        Coffee coffee = new Coffee("Cappuccino", Size.MEDIUM, false, true);
        assertTrue(coffee.toString().contains("Cappuccino") && coffee.toString().contains("MEDIUM"),
                "String should contain both the name and the size.");
    }

    @Test
    void testEquals() {
        Coffee coffee1 = new Coffee("Cappuccino", Size.MEDIUM, true, false);
        Coffee coffee2 = new Coffee("Cappuccino", Size.MEDIUM, true, false);
        assertTrue(coffee1.equals(coffee2), "Both coffees should be the same.");
    }
}
