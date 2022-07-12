package Week.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array = "We learn java basics as part of java sessions in java week1";

		String[] space=array.split(" ");

		int count=0;

		String last="";


		for (int i = 0; i < space.length; i++) {

			for (int j = i+1; j < space.length; j++) {

				if(space[i].equals(space[j]))
				{	
					count++;


					if(count!=0)
					{
						space[j]="";
					}
				}

			}


			if(count!=0)
			{
				count=0;
			}
			
		}
			for (String word : space) 
			{
				last=last+" "+word;
			}
			System.out.println(last);
		}





	}
