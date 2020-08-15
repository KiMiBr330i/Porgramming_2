import java.util.Scanner;

public class Figures {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Kip Brower");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		System.out.println(" ");
		System.out.print("Enter the size of the figure (odd number): ");
		int size = scan.nextInt();

		while (size % 2 == 0) {
			System.out.println("Invalid figure size - must be an odd number");
			System.out.print("Re-enter the size of the figure:");
			size = scan.nextInt();
		}
		System.out.println(" ");
		System.out.println("MENU:");
		System.out.println("1. Print box");
		System.out.println("2. Print diamond");
		System.out.println("3. Print X");
		System.out.println("4. Quit program");
		System.out.println(" ");
		System.out.print("Please select an option: ");
		int jump = scan.nextInt();

		while (jump != 4) {
			if (jump == 1) {
				printBox(size);
				System.out.println(" ");
				System.out.println("MENU:");
				System.out.println("1. Print box");
				System.out.println("2. Print diamond");
				System.out.println("3. Print X");
				System.out.println("4. Quit program");
				System.out.println(" ");
				System.out.print("Please select an option: ");
				jump = scan.nextInt();
			} else if (jump == 2) {
				printDiamond(size);
				System.out.println(" ");
				System.out.println("MENU:");
				System.out.println("1. Print box");
				System.out.println("2. Print diamond");
				System.out.println("3. Print X");
				System.out.println("4. Quit program");
				System.out.println(" ");
				System.out.print("Please select an option: ");
				jump = scan.nextInt();
			} else if (jump == 3) {
				printX(size);
				System.out.println(" ");
				System.out.println("MENU:");
				System.out.println("1. Print box");
				System.out.println("2. Print diamond");
				System.out.println("3. Print X");
				System.out.println("4. Quit program");
				System.out.println(" ");
				System.out.print("Please select an option: ");
				jump = scan.nextInt();
			}

		}

		if (jump == 4) {
			System.out.println(" ");
			System.out.println("good bye!");
		}
		scan.close();
	}
	
	public static void printDiamond(int size) { 
		//------------------------------------------------------------------------------------
		//Loop for diamond figure in three sections: top, middle and bottom.
		//Loop for middle section preserves the diamond's proportions.
		//------------------------------------------------------------------------------------
		for (int num = 1; num <= (0.5) * size; num++) {
			{
				for (int i = 1; i <= ((0.5 * size - (num - 1))); i++)
					System.out.print(" ");
				for (int i = 1; i <= 1; i++)
					System.out.print("X");
				for (int i = 2; i <= ((2 * num) - 1); i++)
					System.out.print(" ");
				for (int i = 1; i <= 1; i++)
					System.out.print("X");
				System.out.println();

			}
		}
		for (int num = 1; num <= 1; num++) {
			{
				for (int i = 1; i <= 1; i++)
					System.out.print("X");
				for (int i = 1; i <= (size - 1); i++)
					System.out.print(" ");
				for (int i = 1; i <= 1; i++)
					;
				System.out.println("X");
			}
		}
		for (int num = 1; num <= (0.5 * size); num++) { 
			{
				for (int i = 1; i <= (num); i++)
					System.out.print(" ");
				for (int i = 1; i <= 1; i++)
					System.out.print("X");
				for (int i = 1; i <= (0.5 * (size) - (2 * num - (0.5 * size - 1))); i++)
					System.out.print(" ");
				for (int i = 1; i <= 1; i++)
					System.out.print("X");
				System.out.println();
			}
		}
	}

	public static void printX(int size) {
		//------------------------------------------------------------------------------------
		//Loop for X figure in three sections: top, middle and bottom.
		//Loop for middle section preserves the X figure's proportions.
		//------------------------------------------------------------------------------------
		for (int num = 1; num <= (0.5 * size); num++) {
			{
				for (int i = 2; i <= (num); i++)
					System.out.print(" ");
				for (int i = 1; i <= 1; i++)
					System.out.print("X");
				for (int i = 1; i <= (0.5 * (size) - (2 * num - (0.5 * size))); i++)
					System.out.print(" ");
				for (int i = 1; i <= 1; i++)
					System.out.print("X");
				System.out.println();
			}
		}
		for (int num = 1; num <= 1; num++) {
			{
				for (int i = 1; i <= (0.5 * size); i++)
					System.out.print(" ");
				for (int i = 1; i <= 1; i++)
					;
				System.out.println("X");
			}
		}
		for (int num = 1; num <= (0.5) * size; num++) {
			{
				for (int i = 1; i <= ((0.5 * size - num)); i++)
					System.out.print(" ");
				for (int i = 1; i <= 1; i++) 
					System.out.print("X");
				for (int i = 2; i <= ((2 * num)); i++) 
					System.out.print(" ");
				for (int i = 1; i <= 1; i++) 
					System.out.print("X");
				System.out.println();
			}
		}
	}
	

	public static void printBox(int size) {
		//------------------------------------------------------------------------------------
		//Loop for box figure.
		//------------------------------------------------------------------------------------
		for (int num = 1; num <= size; num++) {
			{
				for (int i = 1; i <= size; i++)
					System.out.print("X");
				System.out.println();

			}

		}
	}
}

