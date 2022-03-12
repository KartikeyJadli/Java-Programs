import java.io.*;

class TelCall{
    long phno;
    String name;
    int n;
    double amt;
    TelCall(String a,long b,int c){
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
        System.out.println("\n\t\t-------- BILLING OF CALLS --------\n");
        System.out.println("Name of User: " + name);
        System.out.println("Phone number: " + phno);
        System.out.println("No. of calls made: " + n);
        System.out.println("Bill amount: " + amt);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}

public class Bill{

    public static void main(String arg[])throws IOException{
        InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
        System.out.print("\t\t-------- ENTER YOUR DETAILS --------\n");
        
        System.out.println("Enter Your Name: ");
        String a = br.readLine();

        System.out.println("Enter Your Phone Number: ");
        long b = Long.parseLong(br.readLine());

        System.out.println("Enter the number of calls made: ");
        int c = Integer.parseInt(br.readLine());

        TelCall ob1 = new TelCall(a,b,c);
        ob1.compute();
        ob1.display();
    }
}