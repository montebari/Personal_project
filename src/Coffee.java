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
public class Coffee extends Beverage{
	
	private boolean extraShot;
	private boolean extraSyrup;
	
	//constructor
	Coffee(String name, Size size, boolean extraShot, boolean extraSyrup){
		super(name, Type.COFFEE , size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	@Override
	public double calcPrice() {
		double price = (getSize().ordinal() * SIZE_UP) + BASE  ;
		if(extraShot == true) {
			price+= 0.50;
		}
		if(extraSyrup == true) {
			price+= 0.50;
		}
		return price;

	}
	
	@Override
	public String toString() {
		return  super.toString() + " " + extraShot + " " +extraSyrup;
	}
	
	@Override //equals method
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (!(obj instanceof Coffee)) return false;
	    if (!super.equals(obj)) return false; 
	    Coffee other = (Coffee) obj;
	    return extraShot == other.extraShot && extraSyrup == other.extraSyrup;
	}
	
	//setter
	public void setextraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}
	public void setextraSyrup(boolean extraSyrup) {
		this.extraSyrup = extraSyrup;
	}
	
	//getter
	public boolean getextraSyrup() {
		return extraSyrup;
	}
	public boolean getextraShot() {
		return extraShot;
	}
}
