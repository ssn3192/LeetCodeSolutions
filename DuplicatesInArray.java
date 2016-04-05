import java.util.*;
import java.util.Scanner.*;
public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" }; 
		// First solution : finding duplicates using brute force method
		System.out.println("Finding duplicate elements in array using brute force method"); 
		for (int i = 0; i < names.length; i++) { 
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j]) ) { 
					System.out.println(names[i]);
				}
			}
		}

		
	}

}
