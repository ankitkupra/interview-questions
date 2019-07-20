/**
 * @author ankitkumar
 */

/** Approach
 * 1. Input a string
 * 2. Iterate the string till the length of string is 4.
 * 3. If the string contains "-" or "/" replace the string with empty string.
 * 4. Count the set of values with length 4. 
 * */

package com.interview.questions.paytm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctYearsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(distinctYear(str));

	}

	static int distinctYear(String str) {
		// TODO Auto-generated method stub
		String strUnique = "";
		Set<String> uniqueYears = new HashSet<String>(); 
		for(int i=0;i<str.length();i++) {
			//Check if the string contains digits.
			//Add the string to set
			if(Character.isDigit(str.charAt(i))) {
				strUnique += (str.charAt(i));
			}
			
			if(str.charAt(i) == '-' || str.charAt(i) == '/') {
				strUnique = "";
			}
			
			if(strUnique.length()==4) {
				uniqueYears.add(strUnique);
				strUnique = "";
			}
		}
		return uniqueYears.size();
	}

}
