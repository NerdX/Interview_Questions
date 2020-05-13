/* PROGRAM WHICH CONVERT THE INPUT INTEGER ARRAY INTO SORTED_SQUARE - ARRAY.
	AND INPUT INTEGER ARRAY WILL BE IN SORTED FORM.
 */


package Interview_Questions;
import java.util.Scanner;

public class SortedSquare_Array {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("ENTER A SIZE OF AN ARRRAY: - ");
		int n = Sc.nextInt();
		
		int A[] = new int[n];
		System.out.println("ENTER THE ELEMENTS: - ");
		for(int i = 0 ; i < n ; i++) {
			A[i] = Sc.nextInt();
		}
		
		//CORE - LOGIC : - 
		int i = 0;
		int j = n - 1;
		int B[] = new int[n];
		
		for(int k = n - 1 ; k >= 0 ; k--) {
			
			if(Math.abs(A[i]) < A[j]) {
				B[k] = (A[j] * A[j]);
				j = j - 1;
			}
			
			else {
				B[k] = (A[i] * A[i]);
				i = i + 1;
			}
			
		}
		
		System.out.println("SORTED SQUARE ARRAY IS READY : - ");
		
		for(int k = 0 ; k < n ; k++) {
			
			System.out.println(B[k]);
			
		}
		
		Sc.close();
	}

}
