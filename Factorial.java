# Fact
import java.util.Scanner;

public class Factorial{

	
	public static void main(String[] args) {
		int i,fact=1;
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
