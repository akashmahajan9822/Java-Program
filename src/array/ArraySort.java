package array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int [] ar=new int[5]; 
		 ar[0]=200; //100 
		 ar[1]=300; //200 
		 
	
		 ar[2]=400; //300 
		 ar[3]=500; //400 
		 ar[4]=100; //500 
		 
		System.out.println("-----print original info----"); 
		for(int i=0; i<=ar.length-1; i++) 
		{ 
		 System.out.println(ar[i]); 
		} 
		System.out.println("-----print info in ascending order----"); 
		
		
		Arrays.sort(ar);          // sort array 
		
		
		for(int i=0; i<=ar.length-1; i++) 
		{ 
		 System.out.println(ar[i]); 
		} 
		System.out.println("-----print info in descending order----"); 
		for(int i=ar.length-1; i>=0; i--) { 
		 System.out.println(ar[i]); 
		}

		
		
	}

}
