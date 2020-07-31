

public class printDiamond {
int size = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final int size = 0;
	char star = 'X'; 
	char space = '_';
		printDiamond diamond = new printDiamond(); // New Box object created
		//diamond.setSize(9); //invoked setter method to change the size variable
		diamond.printDiamond(9, star); 
}
//method to print asterisk character is box form
	public static void printDiamond(int size, char star) {
		//char star = '*';
		//int size = 0;
		//for (int row = 1; row <= size ; row-=1) { // row print
		//	for (int column = 1; column <= size +1; column++) // column print
		//in the first row: I need to print 4 spaces, two stars, and 4 spaces		
		//in the second row: I need to print 3 spaces, 1 star, 2 spaces, 1 star and 3 spaces
		//in the 3rd: 2 spaces, 1 star, 4 spaces, 1 star, 2 spaces
		//in the 4th; 1 space, 1 star, 6 spaces, 1 star, 1 space
		//5th 1 star, 8 spaces, 1 star
		//6th = 4th
		//7th = 3rd
		//8th = 2nd
		//9th = 1st
				
		////System.out.print(star);
		////System.out.println();
	}
}
//Setter to change the size value for rows and columns
//	public static void setSize(int size) {
//		size = 9;
	

	
	
	

