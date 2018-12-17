import java.io.InputStreamReader;
import java.util.Scanner;

public class reverse_sentence {
public static void main(String[] args) {
		
		
		/*Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Reading input from console using Scanner in Java ");
        System.out.println("Please enter your input: ");*/
        String str= "Welcome World";
        
        String rev= reverseString(str);
        System.out.println("the reversed sentence is"+" "+rev);
        
}

public static String reverseString(String str) {
	if (str.isEmpty())
		return str;
	return reverseString(str.substring(1))+ str.charAt(0);
}

}
