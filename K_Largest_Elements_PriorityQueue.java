package Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class K_Largest_Elements_PriorityQueue {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		//ENTER THE LENGTH OF AN ARRAY: - 
		System.out.println("ENTER THE LENGTH OF AN ARRAY:");
		int N = Sc.nextInt();
		
		//ENTER THE K(K - Largest Elements): - 
		System.out.println("ENTER THE K:");
		int K = Sc.nextInt();
		
		int Arr[] = new int[N];
		
		//ENTER THE ELEMENTS: -
		System.out.println("ENTER THE ELEMENTS:");
		for(int i = 0 ; i < N ; i++) {
			Arr[i] = Sc.nextInt();
		}
		
		//CORE - LOGIC: - 
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
		
		
		for(int i = 0 ; i < N ; i++) {
			
			if(i < K) {
				PQ.add(Arr[i]);
			}
			
			else {
				if(PQ.element() < Arr[i]) {
					PQ.remove();
					PQ.add(Arr[i]);
				}
			}
		}
		
		ArrayList<Integer> A1 = new ArrayList<Integer>(PQ);
		
		//REVERSE_ORDER - SORTING: - 
		Collections.sort(A1,Collections.reverseOrder());
		
		System.out.println(A1);
		
		Sc.close();

	}

}
