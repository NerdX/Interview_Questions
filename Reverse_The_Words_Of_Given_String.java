/* REVERSE THE WORDS OF A GIVEN STRING */

package Interview_Questions;

public class Reverse_The_Words_Of_Given_String {

	public static void main(String[] args) {
		
		String Str = "Let's take LeetCode contest";
		String Str1[] = Str.split(" ");
		String Temp = "";
		
		//CORE - LOGIC : - 
		for(int  i = 0 ; i < Str1.length ; i++) {
			StringBuilder S = new StringBuilder(Str1[i]);
			S.reverse();
			Str1[i] = S.toString();
		}
		for(int  i = 0 ; i < Str1.length ; i++) {
			Temp = Temp +  Str1[i] + " ";
		}

		//IMPORTANT - STEP: - 
		Temp = Temp.trim();
		System.out.println(Temp);
	}

}
