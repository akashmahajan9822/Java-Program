package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	
	
	//it is collection of homogenious data type means similler data type only
	//its index value start with 0
	// it is object so it also having class
//	array  having superclass which is named as class object.
	// he occupied heap memory  all object are store in heap memory
	
	//advantage store multiple value 
	//fast as compare to premitive4 data type  bz avoid internal conversion
	
	// disadvantage fixed sized , wastage of memory chances more, store only smiler data type.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// declares an array of integers
		 int[] anArray;
		 // allocates memory for 10 integers
		 anArray = new int[10];
		
		 
		 // initialize first element
		 anArray[0] = 10;
		 // initialize second element
		 anArray[1] = 20;
		 // and so forth
		 anArray[2] = 30; anArray[3] = 40; anArray[4] = 50; anArray[5] = 60;
		 anArray[6] = 70; anArray[7] = 80; anArray[8] = 90; anArray[9] = 100;
		
		
		
	
		
		
		//step1: array declaration
		
		int [] ar=new int[5];     // int arrya from 0 to 5.
		
		 // you can defined slso like   int  ar [] =new int[5];
		
		 
		 //step2: array initialization
		 ar[0]=200; 
		 ar[1]=300; 
		 ar[2]=400; 
		 ar[3]=500; 
		 ar[4]=100; 
	
		 
		 System.out.println(ar[4]); 
		 System.out.println(ar[0]);
		 
		 System.out.println("array length:"+ar.length); // size of array
		 
		 System.out.println("----print all data from array------");
		 for(int i=0; i<=ar.length-1;i++) 
		 { 
		 System.out.println(ar[i]);   //print all value of array one by one
		 } 
		 
		 System.out.println("----print all data from array In Reverse Order------"); 
		 for(int i=ar.length-1; i>=0; i--) 
		 { 
		 System.out.println(ar[i]); 
		 } 
		 
		 
		 System.out.println(" *****************************************************");
		 
		 String [] ar1=new String[4]; //create object of string array with size 4 
		 ar1[0]="mahesh"; 
		 ar1[1]="ramesh"; 
		 ar1[2]="suresh"; 
		 ar1[3]="ganesh";  
		 
		 System.out.println(ar1[2]); //suresh 
		 System.out.println("array length:"+ar1.length); 
		 System.out.println("----print all data from array------"); 
		
		 for(int i=0; i<=ar.length-2;i++) 
		 { 
		 System.out.println(ar1[i]);   //print all value of array one by one
		 } 
		 
		 System.out.println(" *****************************************************");	 
	
		 
	Arrays.sort(ar1);  
	
	for(int i=0; i<=ar.length-2;i++) 
	 { 
	 System.out.println(ar1[i]);   //print all value of array one by one
	 } 
	
	
	
	
	 System.out.println(" *****************************************************");	 
	 System.out.println("  taking array elements from dynamic input by using scanner class.");	
	

	int[] a=new int[5];
	Scanner s=new Scanner(System.in);
	System.out.println("enter values");
	for (int i=0;i<a.length;i++)
	{ System.out.println("enter "+i+" value");
	a[i]=s.nextInt();  // enter int value from console
	}
	
	
	
	for (int m1:a)  //
	{ System.out.println(m1);
	}
	 System.out.println(" *****************************************************");	 
	 System.out.println("  taking array elements from dynamic input by using scanner class.");	
	
	
	int[] b={10,20,30,40};
	int sum=0;
	for (int a1:b)
	{ sum=sum+a1;
	}
	System.out.println("Array Element sum is="+sum);
	

	 
	}

}
