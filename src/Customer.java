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

public class Customer {
	private String name;
	private int age;
	
	//constructor
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//copy constructor
    public Customer(Customer other) {
        this.name = other.name;
        this.age = other.age;
    }
    
    @Override 
    public String toString() {
    	return name + age;
    }
    
    //setters
    public void setName(String name) {
    	this.name = name;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    //getters
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
}
