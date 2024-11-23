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
import java.util.List;
import java.util.ArrayList;

public class BevShop implements BevShopInterface {
  
	private List<Order> orders;
    private int alcoholCount;
    private Order order;
    private int time;
    private static final int MAX_ORDER_FOR_ALCOHOL = 3;
    private static final int MIN_AGE_FOR_ALCOHOL = 21;
    
    public BevShop() {
        this.orders = new ArrayList<>();
    }

    @Override
    public boolean isValidTime(int time) {
        return time >= MIN_TIME && time <= MAX_TIME;
    }

    @Override
    public int getMaxNumOfFruits() {
        return MAX_FRUIT;
    }

    @Override
    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public boolean isMaxFruit(int numOfFruits) {
        return numOfFruits > MAX_FRUIT;
    }

    @Override
    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }

    @Override
    public boolean isEligibleForMore() {
        return alcoholCount < MAX_ORDER_FOR_ALCOHOL;
    }

    @Override
    public int getNumOfAlcoholDrink() {
        return alcoholCount;
    }

    @Override
    public boolean isValidAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public void startNewOrder(int time, Day day, String customerName, int customerAge) {
        if (isValidTime(time) && isValidAge(customerAge)) {
            order = new Order(orders.size() + 1, day, new Customer(customerName, customerAge));
            orders.add(order);
            alcoholCount = 0;
        }
    }

    @Override
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        order.addNewBeverage(bevName, size, extraShot, extraSyrup);
    }

    @Override
    public void processAlcoholOrder(String bevName, Size size) {
        if (isEligibleForMore()) {
            order.addNewBeverage(bevName, size);
            alcoholCount++;
        }
    }

    @Override
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        if (!isMaxFruit(numOfFruits)) {
            order.addNewBeverage(bevName, size, numOfFruits, addProtein);
        }
    }

    @Override
    public int findOrder(int orderNo) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNum() == orderNo) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public double totalOrderPrice(int orderNo) {
        int index = findOrder(orderNo);
        if (index != -1) {
            return orders.get(index).calcOrderTotal();
        }
        return 0.0;
    }

    @Override
    public double totalMonthlySale() {
        return orders.stream().mapToDouble(Order::calcOrderTotal).sum();
    }

    @Override
    public int totalNumOfMonthlyOrders() {
        return orders.size();
    }

    @Override
    public Order getCurrentOrder() {
        return order;  
    }

    @Override
    public Order getOrderAtIndex(int index) {
        if (index >= 0 && index < orders.size()) {
            return orders.get(index);  // Return shallow copy
        }
        return null;
    }

	public boolean validTime(int time) {

		if (time >= 8 && time <= 23)
			return true;
		else
			return false;
	}
	
    @Override
    public void sortOrders() {
        // Implement selection sort to sort orders based on some criteria
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Monthly Orders and Sales:\n");
        for (Order order : orders) {
            sb.append(order).append("\n");
        }
        sb.append("Total Monthly Sale: ").append(totalMonthlySale());
        return sb.toString();
    }
    
}
