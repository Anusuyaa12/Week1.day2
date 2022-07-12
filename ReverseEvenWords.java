package Week.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";

		String[] array = test.split(" ");		

		for (int i = 0; i < array.length; i++) 
		{
			if (i%2 ==0 ) {
				System.out.print(array[i] + " ");
			}
			else 
			{

				char[] Chars = array[i].toCharArray();

				for (int j = Chars.length-1; j >= 0 ; j--) 
				{

					System.out.print(Chars[j]);
				}
				System.out.print(" ");
			}  
		} 

	}




}
