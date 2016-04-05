
Input: -9772
Output: -2779

import java.util.*;
import java.util.Scanner.*;
public class ReverseInt {
	
	
    public int reverse(int x) {
        
int reverse=0;
		
		while(x!=0)
		{			
			reverse= reverse*10;
		    reverse= reverse + x%10;
		    x= x/10;
		    
		}
	System.out.println("Reverse Number:" +reverse);
		return reverse;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int number= sc.nextInt();
		
		ReverseInt rev= new ReverseInt();
		rev.reverse(number);
		
	}

}
