import java.util.Scanner;

public class ValenciaIcecream {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int weeks;
		
		int reviews;
		
		int sentinel = 1;
		
		int total = 0;
		
		int bonus[][] = new int [7][5];
		
		//Storing all bonus values// 
		
		bonus[0][0] = 25;
		bonus[0][1] = 45;
		bonus[0][2] = 80;
		bonus[0][3] = 110;
		bonus[0][4] = 150;
		bonus[1][0] = 50;
		bonus[1][1] = 60;
		bonus[1][2] = 90;
		bonus[1][3] = 120;
		bonus[1][4] = 180;
		bonus[2][0] = 100;
		bonus[2][1] = 125;
		bonus[2][2] = 160;
		bonus[2][3] = 210;
		bonus[2][4] = 265;
		bonus[3][0] = 160;
		bonus[3][1] = 190;
		bonus[3][2] = 225;
		bonus[3][3] = 275;
		bonus[3][4] = 340;
		bonus[4][0] = 230;
		bonus[4][1] = 265;
		bonus[4][2] = 325;
		bonus[4][3] = 385;
		bonus[4][4] = 450;
		bonus[5][0] = 300;
		bonus[5][1] = 360;
		bonus[5][2] = 420;
		bonus[5][3] = 480;
		bonus[5][4] = 600;
		bonus[6][0] = 425;
		bonus[6][1] = 500;
		bonus[6][2] = 600;
		bonus[6][3] = 725;
		bonus[6][4] = 875;
		
		// For loop that allows the user to place as many values as he wish//
		
		for (int i = 0; i<1 ; i++) {

		if ( sentinel != 0) {
		
		// Allowing user to enter values// 
		
		System.out.println("Please insert the amount of weeks worked");
		weeks = scnr.nextInt();
		
		System.out.println("Now please insert the rates recieved");
		reviews = scnr.nextInt();
		
		//Accepting valid values//
		
		//If the number is higher than the array//
		
		if (weeks >= 6 ) {
			
			weeks = 6;
		
		}
		
		if (reviews >= 4) {
			
			reviews = 4;
			
		}
		
		// If the number is lower than the array//
		
			if (weeks < 0){
				
				for(int k=0; k<1; k++) {
					
					System.out.println("Please insert a number of weeks that is greater or equal to 0");
					
					weeks = scnr.nextInt();	
					
					if (weeks < 0) {
						
						k = -1;
						
					}
				}
		}
			
		if ( reviews < 0) {
			
			for( int j=0; j<1; j++) {
				
				System.out.println("Please insert a number of rates  that is greater or equal to 0");
				
				reviews = scnr.nextInt();
				

				if (reviews < 0) {
					
					j = -1;
					
				}
				
			}
			}
		
		// Display the amount of bonus//
		
		
		System.out.println ("Your bonus is: $" + bonus [weeks][reviews]);
		
		total = total + bonus [weeks][reviews];
		
		
		//Ask to continue the program or terminate it//
		
		
		System.out.println("If you would like to see your total bonus, type 0");
		
		System.out.println("If you would like to add another bonus, type any other number");
		
		sentinel = scnr.nextInt(); 
		
		if (sentinel != 0) {
			i = -1;
		}
		}
			
		}
		
		// Display total bonus // 
		
		System.out.print("Total bonus paid: $" + total);
	}
}
