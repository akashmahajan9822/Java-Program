package basic_Program;

import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//java executed according to this Priority: (), *, /, %, +, - .
		
		
		
		System.out.println(-6+4*2);
		System.out.println((2+3)*4) ;
		System.out.println(9+6-3*4/2%5);
		 System.out.println(7+(3*5)*(4/2)+(5%3)-1);
		
		
System.out.println(" *****************************************************");

System.out.println("Swap 2 no ");
int a = 5;
int b = 8;
int temp;

temp = a;
a = b;
b = temp;

System.out.println("a is storing: " +a);
System.out.println("b is storing: " +b);


//or

int x = 5;
int y = 8;

x=x+y; // x=13
x=x-y; // x=8
y=x-y; //y=5

System.out.println("x is storing: " +x);
System.out.println("y is storing: " +y);

System.out.println(" *****************************************************");




	       System.out.println("multiplication of 2 number ");
		
		
	       
		Scanner scanner = new Scanner(System.in);
	        
	         System.out.println("Input your number:");

	         int n = scanner.nextInt();
	        
	         for(int i=1;i<=10;i++) {
	               
	                System.out.println(n +"x"+i+"="+(n*i));
	               
	         }
	        
	       
  System.out.println(" *****************************************************");


		       System.out.println("Area of circle is ");   
		       
		       System.out.println("Enter the radius of the circle");
	              
               double radius = scanner.nextDouble();
              
              System.out.println("Area of circle is: "+(Math.PI*radius*radius));
              
              
  System.out.println(" *****************************************************");


		       System.out.println("Java program which intakes 6 numbers as input and prints their average ");        
              
		      
		       System.out.println("Enter first number:");
	              
               int firstNumber = scanner.nextInt();
              
              System.out.println("Enter second number:");
              
               int secondNumber = scanner.nextInt();
              
              System.out.println("Enter third number:");
              
               int thirdNumber = scanner.nextInt();
              
              System.out.println("Enter fourth number:");
              
               int fourthNumber = scanner.nextInt();
              
              System.out.println("Enter fifth number:");
              
               int fifthNumber = scanner.nextInt();
              
              System.out.println("Enter sixth number:");
              
               int sixthNumber = scanner.nextInt();
              
              System.out.println("Average of all inputed numbers is: "+(firstNumber+ secondNumber+thirdNumber +fourthNumber +fifthNumber +sixthNumber )/6);
              
             
              
 System.out.println(" *****************************************************");
    
    System.out.println(" Area of Rectangle = Width * height");
    
    System.out.println("Enter width of the Rectangle: ");
    
    double width = scanner.nextDouble();
   
   System.out.println("Enter height of the Rectangle: ");
   
    double height = scanner.nextDouble();
   
   System.out.println("Area of the rectangle is: "+(width *height));
   
   scanner.close();
    
   
   System.out.println(" *****************************************************");
          
	}

}
