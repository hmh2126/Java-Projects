import java.util.Scanner;

public class StackDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StackInterface<Faculty> profStack = new ArrayBasedStack<Faculty>(10);
		int option;

		do {
			System.out.println("Press 1 to add a professor");
			System.out.println("Press 2 to add two professors");
			System.out.println("Press 3 to remove a professor");
			System.out.println("Press 4 to remove two professors");
			System.out.println("Press 5 to see the professor at the top of the stack");
			System.out.println("Press 6 to look at all professors from newest to oldest");
			System.out.println("Press 7 to look at all professors from oldest to newest");
			System.out.println("Press 8 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();

			if (option == 1) {
				System.out.println("Enter the name of the professor");
				String newName = keyboard.nextLine();

				System.out.println("Enter the ID number of the professor");
				int newEmployeeID = keyboard.nextInt();
				keyboard.nextLine(); // flush buffer

				System.out.println("Enter the department the professor teaches in");
				String newDepartment = keyboard.nextLine();

				Faculty currProf = new Faculty();
				currProf.setName(newName);
				currProf.setEmployeeId(newEmployeeID);
				currProf.setDepartment(newDepartment);

				try {
					profStack.push(currProf);
				} catch (StackFullException e) {
					System.out.println(e.getMessage());
				}

			} 
			else if (option == 2) {
				System.out.println("Enter the name of the professor");
				String newName = keyboard.nextLine();

				System.out.println("Enter the ID number of the professor");
				int newEmployeeID = keyboard.nextInt();
				keyboard.nextLine();

				System.out.println("Enter the department the professor teaches in");
				String newDepartment = keyboard.nextLine();

				System.out.println("Enter the name of the second professor");
				String newName2 = keyboard.nextLine();

				System.out.println("Enter the ID number of the second professor");
				int newEmployeeID2 = keyboard.nextInt();
				keyboard.nextLine();

				System.out.println("Enter the department the second professor teaches in");
				String newDepartment2 = keyboard.nextLine();

				Faculty currProf = new Faculty();
				currProf.setName(newName);
				currProf.setEmployeeId(newEmployeeID);
				currProf.setDepartment(newDepartment);

				Faculty currProf2 = new Faculty();
				currProf2.setName(newName2);
				currProf2.setEmployeeId(newEmployeeID2);
				currProf2.setDepartment(newDepartment2);

				try {
					profStack.push(currProf, currProf2);
				} catch (StackFullException e) {
					System.out.println(e.getMessage());
				}
				
			} 
			else if (option == 3) {
				try {
					profStack.pop();
				} catch (StackEmptyException e) {
					System.out.println(e.getMessage());
				}

			} 
			else if (option == 4) {
				try {
					profStack.doublePop();
				} catch (StackEmptyException e) {
					System.out.println(e.getMessage());
				}
			} 
			else if (option == 5) {
				try {
					System.out.println("Professor: " + profStack.top());
				} catch (StackEmptyException e) {
					System.out.println(e.getMessage());
				}

			} 
			else if (option == 6) {
				System.out.println("Professors from newest to oldest");
				System.out.println(profStack.toString());

			} 
			else if (option == 7) {
				System.out.println("The professors from oldest to newest");
				System.out.println(profStack.toString2());

			} 
			else if (option == 8) {
				System.out.println("Thank you for using our program");

			} 
			else {
				System.out.println("Error! Invalid option! Try again.");
			}

		} while (option != 8);

	}

}
