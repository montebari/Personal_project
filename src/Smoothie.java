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
public class Smoothie extends Beverage {
	//instance variable
	private int numFruits;//0.50 ea
	private boolean protein;// 1.50 
	
	//constructor
	public Smoothie(String name, Size size, int numFruits, boolean protein){
		super(name, Type.SMOOTHIE, size);
		this.numFruits = numFruits;
		this.protein = protein;
	}
	
	@Override 
	public double calcPrice() {
		double price = (getSize().ordinal() * SIZE_UP) + BASE  ;
		if(protein == true) {
			price += 1.50;
		}
		return price + (numFruits * 0.50) ;
	}
	
	@Override 
	public String toString() {
		return super.toString() + numFruits + protein;
	}
	
	@Override // equals 
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (!(obj instanceof Smoothie)) return false;
	    if (!super.equals(obj)) return false; 
	    Smoothie other = (Smoothie) obj;
	    return numFruits == other.numFruits && protein == other.protein;
	}
	
	//setters
	public void setNumFruits(int numFruits) {
		this.numFruits = numFruits;
	}
	public void setProtein(boolean protein) {
		this.protein = protein;
	}
	
	//getters
	public int getNumFruits() {
		return numFruits;
	}
	public boolean getProtein() {
		return protein;
	}
}
