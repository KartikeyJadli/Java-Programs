/*
A class TelCall calculates the monthly phone bill of a consumer.
Some of the members of the class are given below.

Class name-
TelCall
Data member-
		Phno- Phone no.
		Name- name of the consumer
		N- no. of calls made
		Amt- bill amount
Methods-
Void compute()- to calculate the phone bill amount based on the slabs given below.
			No. of calls				Rate (Rs.)
			1-100					500/-	:: Rental
			101-200				Rs. 1/call + Rental
			201-300				Rs 1.20/call +  Rental
			above 300				Rs. 1.50/call + Rental

*/

import java.util.*; 

class TelCall{
    String phno;
    String name;
    int n;
    double amt;

    TelCall(String a,String b,int c){
        name = a;
        phno = b;
        n = c;
    }

    void compute(){
        if(n <= 100){
            amt = 500;
        }
        else if(n <= 200){
            amt = 500 + (n - 100)*1.0;
        }
        else if(n <= 300){
            amt = 600 + (n - 200)*1.20;
        }
        else if(n > 300){
            amt = 720 + (n - 300)*1.50;
        }
    }

    void display(){
        System.out.println("\t\t-------- BILLING OF CALLS --------\n");
        System.out.println("Name of User             Phone number            No. of Calls made          Bill Amount ");
        System.out.println(name+"              "+phno+"           "+n+"                       "+amt);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}

public class Billing{

	public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t-------- ENTER YOUR DETAILS --------\n");
        
       	System.out.println("Enter Your Name: ");
        String a = sc.nextLine();

        System.out.println("Enter Your Phone Number: ");
        String b = sc.nextLine();

        System.out.println("Enter the number of calls made: ");
        int c = sc.nextInt();

        TelCall ob1 = new TelCall(a,b,c);
        ob1.compute();
        ob1.display();
    }
}