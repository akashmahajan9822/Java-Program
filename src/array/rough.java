package array;

import java.util.Arrays;

public class rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {20,50,40,30,20};
		System.out.println("----before sorting----");
		
		for (int i = 0; i <= ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}	
		System.out.println("----enhanced for loop----");
		for (int i:ar)
		{
			System.out.println(i);
		}
		
		Arrays.sort(ar);   //sorting
		System.out.println("----after sorting----");
		for (int i = 0; i <= ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}
		System.out.println("----sorting by enhanced for loop----");
		
		for (int i : ar)
		{
			System.out.println(i);
		}
		
		System.out.println("----descending order ----");
		for (int i = ar.length-1; i>=0; i--) 
		{
			System.out.println(ar[i]);
		}
		System.out.println("----sorting by enhanced for loop descending order ----");
		
	}
		
}
