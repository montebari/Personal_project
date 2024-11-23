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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {
	
	private int orderNum;
	private Day orderDay;
	private int time;
	private Customer customer;
	private List<Beverage> beverages;
	private int orderTime;

	Random rand = new Random();
	
	public int random() {
		return rand.nextInt(10000)+90001;
	}	
	//constructor
	public Order(int orderNum,  Day orderDay, Customer customer) {
		this.orderNum = orderNum;
		this.orderDay = orderDay;
		this.customer = new Customer(customer);
        this.beverages = new ArrayList<>();

	}
	
	public Order(int orderNum, int time, Day orderDay, Customer customer) {
		this.orderNum = orderNum;
		this.time = time;
		this.orderDay = orderDay;
		this.customer = new Customer(customer);
        this.beverages = new ArrayList<>();

	}
	
    @Override
    public Beverage getBeverage(int itemNo) {
        if (itemNo >= 0 && itemNo < beverages.size()) {
            return beverages.get(itemNo); 
        }
        return null; 
    }
    
    @Override
    public boolean isWeekend() {
        return this.orderDay == Day.SATURDAY || this.orderDay == Day.SUNDAY;
    }
    //addnewbeverage methods overriden
	@Override
	public void  addNewBeverage(
			String bevName,
			Size size,
			boolean extraShot,
			boolean extraSyrup) {
		beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	
    @Override
    public void addNewBeverage(String bevName, Size size) {
        beverages.add(new Alcohol(bevName, size, isWeekend()));
    }

    @Override
    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
        beverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
    }	

	@Override //tostring
	public String toString() {
		StringBuilder builder = new StringBuilder();
        builder.append("Order Number: ").append(orderNum)
               .append(", Day: ").append(orderDay)
               .append(", Customer: ").append(customer)
               .append("\nBeverages:\n");
        return builder.toString();
	}
	
	@Override //compareto
	public int compareTo(Order other) {
		return Integer.compare(this.orderNum, other.orderNum);
	}
    
	@Override //total cost
    public double calcOrderTotal() {
        double total = 0.0;
        for (Beverage beverage : beverages) {
            total += beverage.calcPrice();
        }
        return total;
    }
	
    @Override //num of beverage type
    public int findNumOfBeveType(Type type) {
        int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage.getType() == type) {
                count++;
            }
        }
        return count;
    }
    public int getTotalItems() {
        return beverages.size();
    }
    
    public int getOrderNum() {
        return orderNum;
    }

    public Day getOrderDay() {
        return orderDay;
    }

    public Customer getCustomer() {
        return new Customer(customer); // Return a deep copy
    }
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}
	

	
	
	
	
}
