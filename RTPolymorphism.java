import java.util.*;

abstract class Card{
	abstract void validate(char arr[]);
}

class MasterCard extends Card{
	void validate(char arr[]){
		if(arr.length == 16){
			if(arr[0] == '5' && (arr[1] >= '1' || arr[1] <= '5')){
				System.out.println("It is a MasterCard");
			}
		}
		else{
			System.out.println("Invalid Card number for MasterCard!!!!!");
		}
	}
}

class Visa extends Card{
	void validate(char arr[]){
		if(arr.length == 13 || arr.length == 15){
			if(arr[0] == '4'){
				System.out.println("It is a Visa Card");
			}
		}
		System.out.println("Invalid Card number for Visa card!!!!!");
	}
}

class AmericanExpress extends Card{
	void validate(char arr[]){
		if(arr.length == 15){
			if(arr[0] == '3' && (arr[1] == '4' || arr[1] == '7')){
				System.out.println("It is an American Express Card");
			}
		}
		else{
			System.out.println("Invalid Card number for American Express!!!!!");
		}
	}
}

public class RTPolymorphism{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		Card c;
	
		System.out.print("Enter Card Number: ");
		String card = sc.nextLine();
		char arr[] = card.toCharArray();

		int choice;

		do{
			System.out.print("\n********** Main Menu For Validation **********\n");
			System.out.print("Press 1. to check for MasterCard\nPress 2. to check for Visa\nPress 3. to check for American Express");
			System.out.print("\nPress 4. To Exit");

			System.out.print("\n\nEnter Choice: ");
			choice = sc.nextInt();
	
			switch(choice){
				case 1:
				MasterCard ob = new MasterCard();
				c = ob;
				c.validate(arr);

				break;
	
				case 2:
				Visa ob1 = new Visa();
				c = ob1;
				c.validate(arr);

				break;

				case 3:
				AmericanExpress ob2 = new AmericanExpress();
				c = ob2;
				c.validate(arr);

				break;
			}
		}while(choice != 4);

		System.out.print("Program Exited!!!!!!");
	}

}

