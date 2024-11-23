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

class BevShopTestStudent {
    private BevShop bevShop;

    @BeforeEach
    void setUp() {
        bevShop = new BevShop();
    }

    @Test
    void testAddOrder() {
        bevShop.startNewOrder(12, Day.MONDAY, "John Doe", 22);
        assertEquals(1, bevShop.totalNumOfMonthlyOrders(), "Should have one order.");
    }

    @Test
    void testTotalMonthlySales() {
        bevShop.startNewOrder(12, Day.MONDAY, "John Doe", 22);
        bevShop.processCoffeeOrder("Espresso", Size.MEDIUM, true, true);
        double expectedTotal = 4.0;
        assertEquals(expectedTotal, bevShop.totalMonthlySale(), "Total monthly sales should match.");
    }
}
