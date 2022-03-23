import java.util.*;
import java.util.Random;
public class Linearsearch{
	
	public static void main(String arg[]){

		Scanner sc = new Scanner(System.in);
		Random randomGenerator = new Random();
		int flag=0;
		int a[] = new int[1000] ; 
	    	for (int idx = 0; idx < 1000; idx++)
		{
	         a[idx] = randomGenerator.nextInt(200);
      		 System.out.println("Number :"+a[idx]);
    		}

		System.out.println("Enter number to search:");
		int ip = sc.nextInt();
		int count = 0;
		for(int i=0;i<1000;i++)
		{
			if(ip == a[i])
			{
				count = count + 1;
				System.out.println("Number found " + count + " times");
				flag=1;
			}	
		}
		if(flag==0)
		{System.out.println("Number not found :( ");}

	
	}
}