import java.util.Scanner;

public class StackDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StackInterface<Faculty> profStack = new ArrayBasedStack<Faculty>(10);
		int option;

		do {
			System.out.println("Press 1 to add a professor");
			System.out.println("Press 2 to remove a professor");
			System.out.println("Press 3 to see the professor at the top of the stack");
			System.out.println("Press 4 to look at all professors from newest to oldest");
			System.out.println("Press 5 to look at all professors from oldest to newest");
			System.out.println("Press 6 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();

			if (option == 1) {

				System.out.println("Enter the name of the professor");
				String name = keyboard.nextLine();
				
				System.out.println("Enter the ID number of the professor");
				int employeeID = keyboard.nextInt();
				keyboard.nextLine();			//flush buffer
				
				System.out.println("Enter the department the professor teaches in");
				String department = keyboard.nextLine();

				Faculty currentProfessor = new Faculty();
				currentProfessor.setName(name);
				currentProfessor.setEmployeeId(employeeID);
				currentProfessor.setDepartment(department);

				try {
					profStack.push(currentProfessor);
				} catch (StackFullException e) {
					System.out.println(e.getMessage());
				}
				
				
			} else if (option == 2) {
				try {
					profStack.pop();
				} catch (StackEmptyException e) {
					System.out.println(e.getMessage());
				}
				
				
			} else if (option == 3) {
				try {
					System.out.println("Professor: " + profStack.top());
				} catch (StackEmptyException e) {
					System.out.println(e.getMessage());
				}
				
				
			} else if (option == 4) {
				System.out.println("Professors from newest to oldest");
				System.out.println(profStack.toString());
				
				
			} else if (option == 5) {
				System.out.println("The professors from oldest to newest");
				System.out.println(profStack.toString2());
				
				
			} else if (option == 6) {
				System.out.println("Thank you for using our program");
				
				
			} else {
				System.out.println("Error! Invalid option! Try again.");
			}
			
			
		} while (option != 6);

	}

}
