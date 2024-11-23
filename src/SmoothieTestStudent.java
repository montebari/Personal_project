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

class SmoothieTestStudent {

    @Test
    void testCalcPrice() {
        Smoothie smoothie = new Smoothie("Berry Mix", Size.LARGE, 3, true);
        assertEquals(7.0 , smoothie.calcPrice());
    }

    @Test
    void testEquals() {
        Smoothie smoothie1 = new Smoothie("Berry Mix", Size.MEDIUM, 2, false);
        Smoothie smoothie2 = new Smoothie("Berry Mix", Size.MEDIUM, 2, false);
        assertTrue(smoothie1.equals(smoothie2));
    }

}
