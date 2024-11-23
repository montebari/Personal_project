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



public class Alcohol extends Beverage {
	
	private boolean weekend;
	
	public Alcohol(String name, Size size, boolean weekend){
		super(name, Type.ALCOHOL, size);
		this.weekend = weekend;
	}
	@Override 
	public double calcPrice() {
		double price = (getSize().ordinal() * SIZE_UP) + BASE  ;
		if(weekend == true) {
			return price + 0.60;
		}else {
			return price;
		}
	}
	
	@Override 
	public String toString() {
		return super.toString() + weekend ;
	}
	
	@Override // equals 
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (!(obj instanceof Alcohol)) return false;
	    if (!super.equals(obj)) return false; 
	    Alcohol other = (Alcohol) obj;
	    return weekend == other.weekend;
	}
	
	//setter
	public void setWeekend(boolean weekend) {
		this.weekend = weekend;
	}
	
	//getter
	public boolean getWeekend() {
		return weekend;
	}
	
}
