/* PROGRAM WHICH REVERSE THE VOWELS OF A GIEVN STRING */

package Interview_Questions;

public class Reverse_Vowels_Of_Given_String {

	public static void main(String[] args) {
		
		String Str = "leetcode";
		
		StringBuilder B = new StringBuilder();
		
		char Chars[] = Str.toCharArray();
		
		//CORE - LOGIC: - 
		for(int i = 0 ; i < Chars.length ; i++) {
			
			if(Chars[i] == 'a' || Chars[i] == 'A' || Chars[i] == 'e' || Chars[i] == 'E' || Chars[i] == 'i' ||Chars[i] == 'I' || Chars[i] == 'i' || Chars[i] == 'o' || Chars[i] == 'O' || Chars[i] == 'u' || Chars[i] == 'U') {
				
				B.append(Chars[i]);
				
			}
		}
		
		B = B.reverse();
		//GAME_CHNGER: - 
		int  j = 0;
		
		for(int i = 0 ; i < Chars.length ; i++) {
			if(Chars[i] == 'a' || Chars[i] == 'A' || Chars[i] == 'e' || Chars[i] == 'E' || Chars[i] == 'i' ||Chars[i] == 'I' || Chars[i] == 'i' || Chars[i] == 'o' || Chars[i] == 'O' || Chars[i] == 'u' || Chars[i] == 'U') {
				Chars[i] = B.charAt(j);
				j = j + 1;
			}
		}
		
		String T = String.valueOf(Chars);
		
		System.out.println(T);

	}

}
