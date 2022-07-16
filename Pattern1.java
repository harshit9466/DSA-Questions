/* 
A 
B C 
D E F 
G H I J 
K L M N O 
*/
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter a Number for Pattern");
        int n = cin.nextInt();
        char ch = 'A';
        for(int Row=1; Row<=n; Row++)
        {
        	for(int Col=1; Col<=Row; Col++)
        	{
        		System.out.print(ch +" ");
        		ch++;
        	}
        	System.out.println();
        }
        cin.close();
	}
}
