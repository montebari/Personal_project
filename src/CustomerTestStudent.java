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

class CustomerTestStudent {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("John Doe", 25);
    }

    @Test
    void testCopyConstructor() {
        Customer newCustomer = new Customer(customer);
        assertEquals(customer.getName(), newCustomer.getName(), "Names should be equal.");
        assertEquals(customer.getAge(), newCustomer.getAge(), "Ages should be equal.");
    }

    @Test
    void testSetName() {
        customer.setName("Jane Doe");
        assertEquals("Jane Doe", customer.getName(), "Name should be changed to Jane Doe.");
    }
}
