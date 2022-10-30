import java.util.Random;
import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int option;
		do {
			System.out.println("Welcome to the password program");
			System.out.println("Press 1 if you want to check if your password is strong enough");
			System.out.println("Press 2 if you want the program to create a password for you");
			System.out.println("Press 3 to exit the program");
			option = keyboard.nextInt();

			if (option == 1) {
				String userPassword = "";
				int passIncludesUpperCase = 2; // 1 represents true and 2 represents false
				int passIncludesLowerCase = 2;
				int passIncludesNumber = 2;

				do {
					System.out.println(
							"Your password must be 8 characters long with at least one upper case letter, one lowercase letter, and include at least 1 number."); // also
																																									// check
																																									// if
																																									// have
																																									// spaces
																																									// in
																																									// the
																																									// password
					System.out.println("Enter your password");
					userPassword = keyboard.next();
					int numberOfCharacters = userPassword.length();
					keyboard.nextLine();

					if ((int) userPassword.length() >= 8) {
						passIncludesUpperCase = 2;
						passIncludesLowerCase = 2;
						passIncludesNumber = 2;

						for (int i = 0; i < userPassword.length(); i++) {
							char ch = userPassword.charAt(i);

							if (Character.isUpperCase(ch)) {
								passIncludesUpperCase = 1;
							}
							if (Character.isLowerCase(ch)) {
								passIncludesLowerCase = 1;
							}
							if (Character.isDigit(ch)) {
								passIncludesNumber = 1;
							}
						}

					}
					if (numberOfCharacters < 8 || passIncludesUpperCase == 2 || passIncludesLowerCase == 2
							|| passIncludesNumber == 2) {
						System.out.println("Please enter a password that satisfies all criteria.");
					}
					if (passIncludesUpperCase == 1 && passIncludesLowerCase == 1 && passIncludesNumber == 1) {
						System.out.println("That's a valid password!");
					}

				} while ((int) userPassword.length() < 8 || passIncludesUpperCase == 2 || passIncludesLowerCase == 2
						|| passIncludesNumber == 2);
			}

			else if (option == 2) {

				int numberOfCharacters = 0;
				do {
					System.out.println("Your password will be comprised of an uppercase and lowercase letters.");
					System.out.println("How many characters would you like your password to be?");
					numberOfCharacters = keyboard.nextInt();

					if (numberOfCharacters <= 0) {
						System.out.println("Please enter a number greater than 0.");
					}

				} while (numberOfCharacters <= 0);

				String upperCaseLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
				String lowerCaseLetters = "qwertyuiopasdfghjklzxcvbnm";

				String pass = "";

				for (int i = 0; i < numberOfCharacters; i++) {

					int random = 0 + (int) (Math.random() * (26) + 1);

					if ((i % 2) == 0) {
						char randUpperCase = upperCaseLetters.charAt(random);
						pass = pass + randUpperCase;
					}

					else {
						char randLowerCase = lowerCaseLetters.charAt(random);
						pass = pass + randLowerCase;
					}

				}

				System.out.println("Your password is: " + pass);

			} else if (option == 3) {
				System.out.println("Thank you for using the program!");
			} else {
				System.out.println("Please input a valid response!");
			}
		} while (option != 3);

	}
}
