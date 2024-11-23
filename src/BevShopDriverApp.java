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
import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BevShop bevShop = new BevShop();

        System.out.println("The current order in process can have at most 3 alcoholic beverages.");
        System.out.println("The minimum age to order an alcoholic drink is 21.");

        while (true) {
            System.out.println("\nStart please a new order:");
            System.out.print("Would you please enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Would you please enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            bevShop.startNewOrder(12, Day.MONDAY, name, age);
            System.out.println("Your Total Order for now is $" + bevShop.getCurrentOrder().calcOrderTotal());

            if (bevShop.isValidAge(age)) {
                System.out.println("Your age is above 21 and you are eligible to order alcohol.");
                while (bevShop.isEligibleForMore()) {
                    System.out.print("Would you like to add an alcohol drink (yes/no)? ");
                    String response = scanner.nextLine();
                    if (response.equalsIgnoreCase("yes")) {
                        System.out.print("Enter the name of the alcohol drink: ");
                        String drinkName = scanner.nextLine();
                        System.out.print("Enter the size (SMALL, MEDIUM, LARGE): ");
                        Size size = Size.valueOf(scanner.nextLine().toUpperCase());
                        bevShop.processAlcoholOrder(drinkName, size);
                        System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
                        System.out.println("The Total price on the Order is $" + bevShop.getCurrentOrder().calcOrderTotal());
                    } else {
                        break;
                    }
                }
                if (!bevShop.isEligibleForMore()) {
                    System.out.println("You have a maximum of alcohol drinks for this order.");
                }
            } else {
                System.out.println("Your Age is not appropriate for alcohol drink!!");
            }

            System.out.print("Would you like to add a coffee or a smoothie (coffee/smoothie/none)? ");
            String drinkType = scanner.nextLine().toLowerCase();
            while (!drinkType.equals("none")) {
                if (drinkType.equals("coffee")) {
                    System.out.print("Enter the name of the coffee: ");
                    String coffeeName = scanner.nextLine();
                    System.out.print("Enter the size (SMALL, MEDIUM, LARGE): ");
                    Size coffeeSize = Size.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print("Extra shot? (yes/no): ");
                    boolean extraShot = scanner.nextLine().equalsIgnoreCase("yes");
                    System.out.print("Extra syrup? (yes/no): ");
                    boolean extraSyrup = scanner.nextLine().equalsIgnoreCase("yes");
                    bevShop.processCoffeeOrder(coffeeName, coffeeSize, extraShot, extraSyrup);
                } else if (drinkType.equals("smoothie")) {
                    System.out.print("Enter the name of the smoothie: ");
                    String smoothieName = scanner.nextLine();
                    System.out.print("Enter the size (SMALL, MEDIUM, LARGE): ");
                    Size smoothieSize = Size.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print("Number of fruits: ");
                    int numOfFruits = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.print("Add protein? (yes/no): ");
                    boolean addProtein = scanner.nextLine().equalsIgnoreCase("yes");
                    bevShop.processSmoothieOrder(smoothieName, smoothieSize, numOfFruits, addProtein);
                }
                System.out.println("Total price on the Order is $" + bevShop.getCurrentOrder().calcOrderTotal());
                System.out.print("Would you like to add another drink (coffee/smoothie/none)? ");
                drinkType = scanner.nextLine().toLowerCase();
            }

            System.out.print("Would you like to start a new order (yes/no)? ");
            if (!scanner.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thank you! Your final total sales are: $" + bevShop.totalMonthlySale());
        scanner.close();
    }
}
