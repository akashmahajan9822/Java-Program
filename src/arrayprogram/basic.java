package arrayprogram;

import java.util.Arrays;

import org.testng.annotations.Test;

import array.Array;

public class basic {
	
	@Test (priority=1)
	  public void EvenOdd() {
		int a[]= {1,2,3,5,6,7};
		
	//	for(int i=0; i<=a.length-1 ; i++) 
			for(int i : a)
		{
			if(i%2==0) {
				System.out.println(i+ "even no");
			}
			else {
				System.out.println(i+ "odd no");
				}
			
     	}
	
		
		System.out.println( "******************************************");
    }
	
	
	@Test   (priority=2)
	public void equalOrNot() {
		
		int a[]= {1,2,3,5,6,7};
		int a1[]= {1,2,3,5,6,4};
		
		
		System.out.println(Arrays.equals(a1, a));
	
		System.out.println( "******************************************");
	}
	
	@Test  (priority=3) 
	public void missingNo() {
		
		int a[]= {1,2,3,5,7};
		int sum=0 , sum1=0 ;
		for(int i=0; i<=a.length-1;i++) {
			 sum=sum+i;
			
		}
  for(int i=0; i<=5;i++) {
			
			sum1=sum1+i;
			
		}
		
  int def= sum1-sum;
		
		System.out.println(def);
	
		System.out.println( "******************************************");
	}
	
	@Test(priority = 4)
	public void MaxNo() {
		int a[] = { 50, 60, 70, 10, 40, 20 };
		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {

				max = a[i];
			}

		}
		System.out.println(max);

		// or
		int maxNo = a[0];
		for (int i : a) {
			if (i > maxNo)
			{
				maxNo = i;
			}

		}

		System.out.println(maxNo);
	

	System.out.println("******************************************");
	
	}
		
	@Test   (priority=5)
	public void MinNo() {
		int a[]= {50,60,70,10,40,20};
		int min=a[1];
		
		for(int i=0; i<a.length; i++) {
			
			if(min>a[i]) {
				
				min=a[i];
			}
			
			
			
		}
		System.out.println(min);
		
		//or
		
		int minNo = a[0];
		for (int i : a) {
			if (i < minNo)
			{
				minNo = i;
			}

		}

		System.out.println(minNo);
		
		
		System.out.println( "******************************************");
		
		
	}
	
	
		
		

	
	@Test   (priority=6)
	public void Duplicate() {
		int a[]= {50,60,70,10,40,10};
		int min=a[1];
		int count=1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {

				if (a[i] == a[j]) 
				{ count++;

					System.out.println(a[i]+ " is duplicate no");
				}
			}
		}  System.out.println(count+ " count of duplicate no");
		
		
		System.out.println( "******************************************");	
		
	}
	
	@Test   (priority=-7)
		public void SearchArray() {
		int a[]= {50,60,70,10,40,10};
		int search=40;
		
		for (int i = 0; i < a.length; i++) {
				if (a[i] == search) {System.out.println(a[i]+ " is search no");}
		}
			
			
			
		}
		
	@Test   (priority=-1000)
	public void insertArray() {
	int a[]= {50,60,70,10,40,10};
	int insert=40;
	int insertAt=3;
	int inserValue=100;
	
	for (int i = a.length-1; i >insertAt-1 ; i--)
	   {
		a[i] = a[i-1];     //
		}
		
		a[insertAt-1]=inserValue;
		for (int i = 0; i <a.length ; i++)
		   {   
			System.out.print(a[i]);
		   }
		
		
		
	}
		
	
	@Test   (priority=-1001)
	public void reverseArray() {
		int a [] = { 10, 100, 20, 30, 40};
		  
		  int start = 0;
		  int end = a.length-1;
		  int temp =0;
		  
		  while (start<end)
		  {
			  temp = a [start]; 
			  a [start] = a[end];   
			  a [end] = temp;     
			  start++;
			  end--;  
		  }
		  
		  for (int i =0; i<a.length; i++)
		  {
			System.out.print(a[i]+" ");  
		  }
		  
		  
	
	}
	@Test   (priority=-1002)
	public void sortarray() {
	
	int a [] = { 20, 30, 40, 50, 30};
	System.out.println("==before sorting==");
	for (int i =0; i<a.length-1; i++)
	{
		System.out.println(a[i]);
	}
	
	Arrays.sort(a);
	System.out.println("==After sorting==");
	 for (int i =0; i<a.length-1; i++)
	 {
		System.out.println(a[i]); 
	 }
	
	}

}
