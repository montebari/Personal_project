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
public abstract class Beverage {
	//instance variables
    private String name;
    private Type type;
    private Size size;
    public static final double BASE = 2.0;
    public static final double SIZE_UP = 1.0;
    //constructor
    Beverage(String name, Type type, Size size){
    	this.name = name;
    	this.type = type;
    	this.size = size;
    }
    
    //abstract method calcPrice()
    public abstract double calcPrice();
    
    @Override // toString method
    public String toString() {
    	return name +" " + size;
    }
    
    @Override //equals method
    public boolean equals(Object obj) {
        if (obj instanceof Beverage) {
            Beverage other = (Beverage) obj;
            return this.name.equals(other.name) && this.type == other.type && this.size == other.size;
        }
        return false;
    }
    
    //setters
    public void setName(String name) {
    	this.name = name;
    }
    public void setType(Type type) {
    	this.type = type;
    }
    public void setSize(Size size) {
    	this.size = size;
    }
    
    //getters
    public String getName() {
    	return name;
    }
    public Type getType() {
    	return type;
    }
    public Size getSize() {
    	return size;
    }
}
