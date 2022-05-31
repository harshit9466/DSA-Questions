// This program checks if you have entered a Uppercase, lowercase or Number 
import java.util.Scanner;

public class ifelse {
 public static void main(String args[])
 {
	 Scanner cin = new Scanner(System.in);	
	 char var = cin.next().charAt(0);
	 if(var>=97 && var<=122) // ASCII valve of a to z
		 System.out.println("Lowercase");
	 else if(var>=65 && var<=90) // ASCII valve of A to Z
	 System.out.println("Uppercase");
	 else if(Character.getNumericValue(var)>=0 && Character.getNumericValue(var)<=9) // Converted the Character 'var' to Integer
	 System.out.println("Number");
	 else
		 System.out.println("Symbol");
	 cin.close();
 }
}
