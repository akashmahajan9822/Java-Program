package basic_Program;

public class Basic {

	public static void main(String[] args) {

		
		System.out.println("1.odd and even no. ");
		
		
		for(int x=1; x<=20; x++)
		{
			if(x%2==0)   // remainder 0 then even no and if block executed
			         	// remainder 1 then odd no and else block executed
			{
				System.out.println("even no is " + x);
			}
			else    
			System.out.println("odd no is "+ x);
			
		}	
		
System.out.println("******************************************************");   	


		
System.out.println("2.Write a simple program using for loop to identify given no is perfect no.");
		 
	int sum=0;
	int no=7;
	
		for (int i=1; i<no; i++) 
		{
			if(no%i==0) 
			sum+=i;
			
		}   
		
		if(sum==no)
		System.out.println( no+" is a perfect no is: ");
		else
			System.out.println( no+ " is a non perfect no is: ");

		
System.out.println("******************************************************"); 
		


System.out.println("3.Write the simple java program using for loops to decide given no is prime or not?");
		
		  int number=5, condition=0;
			
			if(number==0||number==1){  
			 System.out.println(number+" is not prime number");      
				  }
			else { 
			for(int i=2; i<number; i++)
			{   
				if(number%i==0)
					condition+=1; 
			}
			 
			if(condition==0)
				System.out.println(number+" is prime no");
			else
				System.out.println(number+" is not prime no");
				  }	
		
		
System.out.println("******************************************************");  



System.out.println("4.Write the simple java program to reverse the given no using while loop.");
System.out.println("5.Java program to find the sum of all the digits in the inputed number.");			
			int y=1234;
			
			int remainder=0;
			int reverseNo=0 , suminp=0;
			
			while (y!=0)
			{
				remainder=y%10;    //modules or remainder 
				reverseNo=reverseNo*10+remainder;    //1st 0*10+4=4, 2nd 4*10+3=43;
				 suminp+=remainder;
				y=y/10;
				}
			
	System.out.println("Reverse number value  " + reverseNo);
	System.out.println("sum of all the digits in the inputed number  " + suminp);
 				
		
System.out.println(" *****************************************************");


System.out.println(" Problem 5: Factorial Program");
//4! = 4*3*2*1 = 24  
//5! = 5*4*3*2*1 = 120

int factor=1, input=5;
for(int i1=1; i1<=input; i1++) {
	factor=factor*i1;
}

System.out.println(factor+" is a factor of "+ input);


System.out.println(" *****************************************************");


	
System.out.println(" Problem 6: palindrome number is a number that is same after revers");
	
//palindrome number is a number that is same after revers
//same as reverse number just compare reverse no and input no.
	
int numb=12321, remain=0, revNo=0 , temp=number  ;

while (numb!=0)
{
	remain=numb%10;    //modules or remainder 
	revNo=revNo*10+remain;    //1st 0*10+4=4, 2nd 4*10+3=43;
	numb=numb/10;
	
	}
if(revNo==temp)
System.out.println(revNo+ " is a palindrome number  " );
	
else 	
	System.out.println(revNo+ " is not a palindrome number  "  );

System.out.println(" *****************************************************");
//System.out.println(" Problem 7: find palindrome number from 1 to 200 ");


for(int i=1; i<=200; i++) {
int reves=0 ,remaider=0 ;
int num = i;

while(num!=0)  {

remainder = num%10;
reves = (reves*10)+remaider;
num = num/10;

}

if(reves==i) {
System.out.print(i+" ");
}

}



System.out.println(" *****************************************************");


System.out.println(" Problem 7: Armstrong number");
//3: 31 = 3
//153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
//125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
//1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643
	

int a=153, tem=a , r , Sum=0;


           while(a>0)  {
             r=a%10;
             a=a/10;
          Sum=Sum+r*r*r;  // mulriply r 4 times when size is 4.
           }
       if(tem==Sum)
    	   
System.out.println("ArmStrongNo");

       else
	
System.out.println("NotArmStrongNo");

	
       System.out.println(" *****************************************************");


       System.out.println(" Problem 8: Random Number");
       
       
       
       
       
       
       System.out.println(" *****************************************************");


       System.out.println(" Problem 9:	Feboncci series");
     //loop starts from 2 because 0 and 1 are already printed   
       
       
       int n1=0,n2=1,n3,i,count=10; 
       
       for(i=2;i<count;++i) 
       {    
     System.out.print(" "+n1);   
        n3=n1+n2;     
        n1=n2;   
        n2=n3;    
       }
       
       System.out.println();
       
       System.out.println(" *****************************************************");


       System.out.println(" Problem 10: Lcm and hcf");
       
       
       
       



	}

}
