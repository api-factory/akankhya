import java.io.InputStreamReader;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args){
	     
		int num2;
		int rev=0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Reading input from console using Scanner in Java ");
        System.out.println("Please enter your input: ");
        int num = scanner.nextInt(); 
        //int rev = scanner.nextInt();
        num2=num;
        while(num!=0)
        {
        	rev= rev * 10;
        	rev= rev+num % 10;
        	num= num/10;
        }
        //System.out.println("reverse numberis"+rev);
        if(num2==rev)
        {
        	System.out.println("It is a pallindrome number");
        }
        else
        {
        	System.out.println("It is not a palindrome number");
        }
	}

}
