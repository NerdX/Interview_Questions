/* PROGRAM WHICH PRINTS THE SUM OF FIRST Nth TERMS OF GIEVN SERIES.*/
/*SERIES = 1 + (1 / 4) + (1 / 7) + (1 / 10) + ... */

package Interview_Questions;

import java.util.Scanner;

public class SumOf_First_Nth_TermsOf_Series {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("ENTER Nth TERM: - ");
		int N = Sc.nextInt();
		
		double Result = 0.0;
		double Temp = 1.0;
		
		//CORE - LOGIC : - 
		for(int i = 0 ; i < N ; i++) {
			
			Result = Result + (1/Temp);
			Temp = Temp + 3.0;
		}
		Result = Math.round(Result * 100.0) / 100.0;
		System.out.println(Result);
		
		//DOUBLE T0 STRING CONVERSION:
//		String S = Double.toString(Result);
//		System.out.println(S);
		
		Sc.close();
	}

}