import java.util.*;

class Account{
	float amount;
	String name,acc;
	
	void Setvalues(String name,String acc,float amount){
		this.name = name;
		this.acc = acc;
        	this.amount = amount;
	}

	void Deposit(float amount){
		this.amount = this.amount + amount;
		
	}

	void withdraw(float a){

        	if(this.amount > a){
            		this.amount = this.amount - a;
        	}
        	
		else{
            		System.out.println("The Account has insufficient Balance!!!!");
        	}
        }
	
	void display(){
        
		System.out.println("\t\t---------- BANK ACCOUNT DETAILS ----------\n");
        	System.out.println("Name : " + name);
        	System.out.println("Account Number : " + acc);
        	System.out.println("Balance : " + amount);
        	System.out.println("XXXXXXXXXXXXXXXXXXXX");
    	}
}

public class Bank{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t-------- ENTER YOUR DETAILS --------\n");
        
       	System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Your Account Number: ");
        String acc = sc.nextLine();

        float amount = 0;
        
        Account a1 = new Account();
        a1.Setvalues(name,acc,amount);

	a1.display();
	System.out.println("\nAccount Created :) ");
	
	System.out.println("\nDo you want to Move Forward for Depositing/Withdrawing (Y or N)?");
	char y = sc.next().charAt(0);
	
	if(y == 'Y'){
		System.out.println("Enter the Amount to Deposit: ");
        	amount = sc.nextFloat();

        	a1.Deposit(amount);

        	System.out.println("Enter the Amount to Withdraw: ");
        	float b = sc.nextFloat();

        	a1.withdraw(b);	
		a1.display();		
	}
	else{
        	a1.display();
	}
    }
}