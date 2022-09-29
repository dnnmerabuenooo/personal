import java.util.Scanner;

public class App {

	// Scanner Object
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		orderPizza();
	}

	static void orderPizza() {

		System.out.println("Welcome to Angel's Pizza!");

		System.out.println("Enter 'A' if you want a Creamy Spinach Dip pizza!");
		System.out.println("Enter 'B' if you want a Garlic Shrimp pizza!");

		System.out.print("Enter your choice: ");
		char choice = scan.next().charAt(0);

		// Initial value
		String pizza = "";
		double price = 0;

		switch (choice) {
			case 'A':
				pizza = "Creamy Spinach Dip Pizza";
				price = 515.00;
				break;
			case 'B':
				pizza = "Garlic Shrimp Pizza";
				price = 505.00;
				break;
			default:
				System.out.println("Please enter A or B!");
				return;
		}

		System.out.println("Your order is: " + pizza);
		System.out.println("Your total order amount is: " + price);

		System.out.println("Enter 'COD' if you want cash on delivery!");
		System.out.println("Enter 'Credit' if you want to use credit card!");

		System.out.print("Enter your choice: ");
		String paymentMethod = scan.next();

		switch (paymentMethod) {
			case "COD":
				System.out.println("Please prepare exact amount upon delivery.");
				break;
			case "Credit":
				System.out.print("Enter credit card number:");
				int cardNumber = scan.nextInt();
				break;
			default:
				System.out.println("Invalid!");
				return;
		}

		System.out.println("Do you have an Angel's Pizza card? (true or false)");
		System.out.print("Please enter true or false: ");
		boolean hasAngelsPizzaCard = scan.nextBoolean();

		if (hasAngelsPizzaCard == true) {
			System.out.println("You get a free pizza!");
		} else {
			System.out.println("Try availing an Angel's Pizza card next time :)");
		}

		System.out.println("Choose delivery method! (1 or 2)");
		System.out.println("1. Pick-up");
		System.out.println("2. Deliver");
		System.out.print("Enter delivery method: ");
		String deliveryMethod = scan.next();

		switch (deliveryMethod) {
			case "1":
				System.out.println("Please wait while we prepare your order!");
				break;
			case "2":
				System.out.print("Okay, we'll have your order delivered!");
				break;
			default:
				System.out.println("Ano gusto mo teleport?");
				return;
		}

		scan.close();
	}
}
