
/*Input: Hello World
Output: World 
length: 5 */

-------------------Author: Shivani Narang-----------------------------------

import java.util.*;
import java.util.Scanner.*;
public class CountofLastword {

	public void Lengthoflastword(String word){
		
		if(word.length()==0)
			return;
		
     String lastword= word.substring(word.lastIndexOf(" ")+1);
		
		System.out.print("last word of the sentence :" +lastword);
				
		int len= lastword.length();
		System.out.println();
		System.out.print("Length of last word:" +len);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CountofLastword ob= new CountofLastword();

		
		String w;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		
		w= sc.nextLine();
		
		ob.Lengthoflastword(w);
		
		
		
	}

}





