import java.io.InputStreamReader;
import java.util.Scanner;

public class Armstrong_num {
public static void main(String[] args) {
		
		int res=0,sum=0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Reading input from console using Scanner in Java ");
        System.out.println("Please enter your input: ");
        int num = scanner.nextInt(); 
        
        int num2=num;
        while(num!=0)
        {
        	res = num % 10;
        	sum= sum+res*res*res;
        	num= num/10;
            
        }
        
        if(sum==num2)
        {
        	System.out.println("It is a armstrong number");
        }
        else
        {
        	System.out.println("It is not a armstrong number");
        }
}

}
