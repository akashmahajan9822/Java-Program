package array;

import java.util.Arrays;

public class arrayInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ar1= {10,50,40,30,20};    //declarationInitialization_in_singleStep 
		 
		 System.out.println(ar1.length); 
		 
		 System.out.println("-----print all info from int array-------"); 
		 for(int i=0; i<=ar1.length-1; i++) 
		 { 
		 System.out.println(ar1[i]); 
		 } 
		 System.out.println("-----sort array-------"); 
		
		 
		 Arrays.sort(ar1);   
		 
		 for(int i=0; i<=ar1.length-1; i++) 
		 { 
		 System.out.println(ar1[i]); 
		 } 
		 
		 
		 //declarationInitialization_in_singleStep 
		 
		 String [] ar= {"mahesh","ramesh", "suresh","ganesh"}; 
		 
		 System.out.println(ar.length); //4 
		 System.out.println("---print all info from string array----"); 
		 for(int i=0; i<=ar.length-1; i++) { 
		 System.out.println(ar[i]); 
		 
		  }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
