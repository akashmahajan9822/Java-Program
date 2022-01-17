package basic_Program;

public class roughj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 1221, Sum = 0 ;
		boolean condition = false;
		
		int	reverseNo =0, var=no ;
		
		while(no!=0){

		int	remainder=no%10;
			reverseNo = reverseNo*10 +remainder;
			no=no/10;
			}

			System.out.println(reverseNo);
			
			if(reverseNo==var) {
				
				System.out.println("palindromNo");
				
			}
			else {System.out.println("not palindromNo");
				
			}
			
		 
		if(no!=0 || no!=1){

			for(int i=2; i<no;i++){
			if(no%i==0){
			 condition= true;
			 System.out.println(condition);
			}

			}

			if(condition){
			System.out.println(" non perfect no ");
			}
			else {

			System.out.println("  perfect no ");
			}

			}
		
		
		int factor=1;
		for(int i=1;i<=no;i++){
		factor=factor*i;


		}
		System.out.println(factor);
		
		
			}
	
	}


