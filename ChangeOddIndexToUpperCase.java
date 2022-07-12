package Week.day2;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String test = "changeme";

		char[] chars=test.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			if(i%2!=0)
			{

				chars[i]=Character.toUpperCase(chars[i]);

			}
		}
		System.out.println(chars);

	}}
