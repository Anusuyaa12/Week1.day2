package Week.day2;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String Name ="madam";
		String rev="";

		char[] chars=Name.toCharArray();
		for (int j = 0; j < chars.length; j++) {
			rev = rev + chars[j];

		}	System.out.println("Reversed string is " + rev);


		if (Name.equalsIgnoreCase(rev)) {
			System.out.println("It is a Palindrome");

		} else {
			System.out.println("Not a Palindrome");



		}

	}

}
