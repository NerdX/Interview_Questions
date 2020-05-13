package Interview_Questions;

import java.util.Scanner;

public class Reverse_String_WordByWord {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("ENTER A STRING");
		String S1 = Sc.nextLine();
		
		String S[] = S1.split(" ");
		
		for(int i = 0 ; i < S.length ; i++) {
			S[i] = S[i].trim();
			
		}
		
		String Ans = "";
		
		for(int i = S.length - 1 ; i >= 0 ; i--) {
			if(S[i].equals("")) {
				continue;
			}
			else {
				Ans = Ans + S[i] + " ";
			}
		}
		System.out.println(Ans.trim());
		Sc.close();
	}

}
