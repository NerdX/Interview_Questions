/* PROGRAM WHICH CALCULATE THE UNION OF TWO INTEGER - ARRAYS. */

package Interview_Questions;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Union_Of_Two_Integer_Arrays {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		//ENTER THE LENGTH OF FIRST ARRAY: - 
		System.out.println("ENTER THE LENGTH OF FIRST ARRAY:");
		int N = Sc.nextInt();
				
		int Arr[] = new int[N];
		//ENTER THE ELEMENTS OF FIRST ARRAY: - 
		System.out.println("ENTER THE ELEMENTS OF FIRST ARRAY: - ");
		for(int i = 0 ; i < N ; i++) {
					
			Arr[i] = Sc.nextInt();
					
		}
		
		//ENTER THE LENGTH OF FIRST ARRAY: - 
		System.out.println("ENTER THE LENGTH OF FIRST ARRAY:");
		int M = Sc.nextInt();
						
		int Arr2[] = new int[N];
		//ENTER THE ELEMENTS OF FIRST ARRAY: - 
		System.out.println("ENTER THE ELEMENTS OF FIRST ARRAY: - ");
		for(int i = 0 ; i < M ; i++) {
							
			Arr2[i] = Sc.nextInt();
							
		}
		
		//CORE - LOGIC: - 
		Set<Integer> S1 = new TreeSet<Integer>();
		
		for(int i = 0 ; i < N ; i++) {
			S1.add(Arr[i]);
		}
		
		for(int i = 0 ; i < M ; i++) {
			S1.add(Arr2[i]);
		}
		
		System.out.println("UNION IS : - ");
		System.out.println(S1);
		
		Sc.close();
	}

}
