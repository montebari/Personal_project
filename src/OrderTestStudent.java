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

class OrderTestStudent {

    private Order order;
    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("John Doe", 25);
        order = new Order(12345, 12, Day.MONDAY, customer);
    }

    @Test
    void testAddNewBeverage() {
        order.addNewBeverage("Coffee", Size.SMALL, false, false);
        assertEquals(1, order.getTotalItems());
        assertEquals("Coffee", order.getBeverage(0).getName());
    }

    @Test
    void testOrderTotalCalculation() {
        order.addNewBeverage("Coffee", Size.SMALL, false, false);
        order.addNewBeverage("Smoothie", Size.LARGE, 2, true);
        double expectedTotal = 2.0 + 6.5; 
        assertEquals(expectedTotal, order.calcOrderTotal());
    }

    @Test
    void testFindBeverage() {
        order.addNewBeverage("Smoothie", Size.LARGE, 2, true);
        int index = order.findNumOfBeveType(Type.SMOOTHIE);
        assertTrue(index >= 0);
    }
}
