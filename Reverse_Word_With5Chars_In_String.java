/* PROGRAM WHICH REVERSE A WORD HAVING 5 OR MORE CHARACTERS FROM GIEVN STRING.
   STRINGS PASSED IN WILL CONSIST OF ONLY LETTERS AND SPACES.
   SPACCES WILL BE INCLUDED ONLY WHEN MORE THEN ONE WORD IS PRESENT.*/

package Interview_Questions;

public class Reverse_Word_With5Chars_In_String {

	public static void main(String[] args) {
		
		String S1 = "This Is A Another Test";
		String S2 = "";
		String S[] = S1.split(" ");
		
		//CORE - LOGIC : - 
		for(int i = 0 ; i < S.length ; i++) {
			
			if(S[i].length() >= 5) {
				
				String Temp = "";
				
				for(int j = S[i].length() - 1 ; j >=0 ; j--) {
					
					Temp = Temp + S[i].charAt(j);
				}
				
				S2 = S2.concat(Temp + " ");
			}
			
			else {
				
				S2 = S2.concat(S[i] + " ");
			}
		}
		System.out.println(S2);

	}

}
