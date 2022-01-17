package array;

public class MultidymentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // 0  1  2 
		 //0 10 20 30 
		 //1 40 50 60 

		int [][] ar=new int[2][3];    //aray object creation
		// row then column
		//or   int  ar [][]=new int[2][3]; 
		
		ar[0][0]=10; 
		 ar[0][1]=20; 
		 ar[0][2]=30; 
		 ar[1][0]=40; 
		 ar[1][1]=50; 
		 ar[1][2]=60; 
		 
		 System.out.println(ar.length); //length  2
		 System.out.println(ar[0][2]); //6
		 
		 
		//outer for loop for rows 
		// //2<=1 2

		  for(int i=0; i<=1; i++) 
		 {                                 //inner for loop for cols     //3<=2 3
		 for(int j=0; j<=2; j++) 
		 {                                       // 1 2
		 System.out.print(ar[i][j]+" "); 
		 } 
		 System.out.println(); 
		 } 
		 
		 
		  System.out.println("----- diamentional array declearation and initialization at a time ----"); 	 

		  System.out.println("2*3 array"); 	 	  
    int [][] ar3= {{10,20,30 },{40,50,60}}; 
		  
		  for (int i = 0; i <=1; i++) { 
		  for (int j = 0; j <=2; j++) 
		  { 
		  System.out.print(ar3[i][j]+" "); 
		  } 
		  System.out.println(); 
		  }
		  System.out.println("3*4 array"); 	 
		  int [][] ar4= {{10,20,30,40},{40,50,60 ,80 },{30,20,30 ,40}}; 	 
		   for (int i = 0; i <=2; i++) { 
			  for (int j = 0; j <=3; j++) 
			  { 
			  System.out.print(ar4[i][j]+" "); 
			  } 
			  System.out.println(); 
			  }
		   System.out.println("4*4 array");
		   int [][] ar2= {{10,20,30 ,40},{40,50,60 ,80 },{30,20,30 ,40},{80,50,60 ,80 }}; 
			  
			  for (int i = 0; i <=3; i++) { 
			  for (int j = 0; j <=3; j++) 
			  { 
			  System.out.print(ar2[i][j]+" "); 
			  } 
			  System.out.println(); 
			  }
		 
		 
		 
	}

}
