import java.io.InputStreamReader;
import java.util.Scanner;

public class Prime_number {
	
	public static void main(String[] args) {
		
		int i,m=0,flag=0;
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Reading input from console using Scanner in Java ");
        System.out.println("Please enter your input: ");
        int num = scanner.nextInt(); 
        m=num/2;
		{
		if(num==0 && num==1 )
		{
			System.out.println("Number is a prime number");
		}
			
			else
			{
				for(i=2;i<=m;i++)
				
					if(num%i==0)
					{
						System.out.println("Number is not a prime number");
					flag=1;
					break;
					}
			}
						
		}
			
	
		if(flag==0)
		{
			System.out.println("Number is not a prime number");
		}
				
			
	
	}
			
}



