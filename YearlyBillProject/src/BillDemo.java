import java.util.Scanner;

public class BillDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numberOfBills;
		int numberOfTransversals = 0;
		int option;
		System.out.println("This program will help keep track of your yearly bills!");

		do {
			System.out.println("How many bills you want to track");
			numberOfBills = keyboard.nextInt();
			if (numberOfBills <= 0) {
				System.out.println("Please enter a number greater than 0");
			}
		} while (numberOfBills <= 0);

		Bill[] yearlyBills = new Bill[numberOfBills];

		do {
			System.out.println("Press 1 to add a bill");
			System.out.println("Press 2 to find the total price of all bills");
			System.out.println("Press 3 to see all information");
			System.out.println("Press 4 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();

			if (option == 1) {
				System.out.println("What is the name of the bill?");
				String name = keyboard.nextLine();

				int invoiceNumber;
				do {
					System.out.println("What is the invoice number?");
					invoiceNumber = keyboard.nextInt();

					if (invoiceNumber < 0) {
						System.out.println("Please enter a valid number");
					}
				} while (invoiceNumber < 0);
				keyboard.nextLine();

				System.out.println("What is the due date?");
				String dueDate = keyboard.nextLine();

				double price;
				do {
					System.out.println("What is the price?");
					price = keyboard.nextDouble();

					if (price < 0) {
						System.out.println("Please enter a valid number");
					}
				} while (price < 0);
				keyboard.nextLine();

				System.out.println("What is the payment method");
				String paymentMethod = keyboard.nextLine();

				Bill userBill = new Bill();
				userBill.setName(name);
				userBill.setInvoiceNumber(invoiceNumber);
				userBill.setDueDate(dueDate);
				userBill.setPrice(price);
				userBill.setPaymentMethod(paymentMethod);

				if (numberOfTransversals < yearlyBills.length) {
					yearlyBills[numberOfTransversals] = userBill;
					numberOfTransversals++;
				} else {
					System.out.println("You have reached your limit");
				}

			} else if (option == 2) {
				double sum = 0.0;
				for (int i = 0; i < numberOfTransversals; i++) {
					sum = yearlyBills[i].getPrice() + sum;
				}
				System.out.println("The total of price of your bills are: " + sum);
			} else if (option == 3) {
				for (int i = 0; i < numberOfTransversals; i++) {
					System.out.println("Bill " + (i + 1) + ":");
					System.out.println("Name: " + yearlyBills[i].getName());
					System.out.println("Invoice Number: " + yearlyBills[i].getInvoiceNumber());
					System.out.println("Due Date: " + yearlyBills[i].getDueDate());
					System.out.println("Price: " + yearlyBills[i].getPrice());
					System.out.println("Payment Method: " + yearlyBills[i].getPaymentMethod());
					System.out.println("");
				}
			} else if (option == 4) {
				System.out.println("Thank you for using the program");
			}

		} while (option != 4);

	}

}
