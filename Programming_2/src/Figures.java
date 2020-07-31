import java.util.Scanner;

public class Figures {

	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size = 0;
		Figures ex = new Figures();
		Figures diamond = new Figures();
		Figures box = new Figures(); // New Box object created
		box.setSize(5); //invoked setter method to change the size variable
		box.printBox(); 
	}
	//method to print asterisk character is box form
	public static void printBox() {
		char star = '*';
		int size = 5;
		for (int row = 1; row <= size; row++) { // row print
			for (int column = 1; column <= size; column++) // column print

				System.out.print(star);
			System.out.println();
		}
	}
	//Setter to change the size value for rows and columns
	public void setSize(int size) {
		size = 5;
		
	}
	public static void printDiamond() {
		char star = '*';
		int size = 5;
		for (int row = 1; row <= size; row++) { // row print
			for (int column = 1; column <= size; column++) // column print

				System.out.print(star);
			System.out.println();
		}
	}



}
