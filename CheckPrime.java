// Checks if a Number is Prime or Not
import java.util.Scanner;

public class CheckPrime {
	public static void checkprime(int num)
	{
			for(int i=2; i<num; i++)
			{
				if(num%i == 0) // if the remainder comes 0 after dividing by any numbers B/W 2 upto Num then its Non-Prime.
				{
					System.out.println("Non Prime");
					System.exit(0); // exit the code once we found that the number is Non-Prime, no need to check any further. 
				}
			}
			System.out.println("Prime");
			
	}
	
 public static void main(String args[])
  {
	   int num;
	   Scanner cin = new Scanner(System.in);
	   num = cin.nextInt();
	    checkprime(num);
	    cin.close();
  }
}
