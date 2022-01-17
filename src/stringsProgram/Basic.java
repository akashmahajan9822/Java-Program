package stringsProgram;

import org.testng.annotations.Test;



public class Basic {
	
	@Test  (priority=1)
	public void SplitString() {
		
		// 16. split() 
		// Use for loop and array for executing. 
		// Use to split the Complete String by specific Word 
		
		String Study = "Velocity is the Best Classes in India"; 
		System.out.println(Study.length()); 
		 String[] Str = Study.split(" "); //split by space
		 System.out.println(Str.length); 
		 
		 for(int i=0; i<=Str.length-1; i++) 
		 { 
		 System.out.println(Str[i]);
		
		 } 
		
	}

	@Test (priority=2)
	public void reverseString() {
		
		 System.out.println("1. Reverse String ");
	       
		   	
			String str="Don't take revenge. let Karma do all the work";
			String rev="";
			
			for(int i=str.length()-1; i>=0; i--) {     // s.length show string length
				
				rev =rev + str.charAt(i);
				
				}
			System.out.println("reverse string :"+ rev);
					
			
			 
			
			
		    System.out.println(" or using StringBuilder ");
		     
		     
			StringBuilder a = new StringBuilder("Don't take revenge. let Karma do all the work");
							System.out.println(a);
							 System.out.println(a.reverse());  //only for string with new keyword
							 System.out.println(a);
			 
								System.out.println(str.length());   // show length  of string    s.length()   s= is string variable name
								System.out.println(str.charAt(0));// show each charactor of string  s.charAt()  character at index
								System.out.println(str.charAt(1));
								System.out.println(str.charAt(2));
								System.out.println(str.charAt(3));
							 
			}
	
	@Test  (priority=5)
	public void PalindromeString() {
		String str="Don't take revenge. let Karma do all the work";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {     // s.length show string length
			
			rev =rev + str.charAt(i);
			
			}
		System.out.println("reverse string :"+ rev);
				
		
		 
		 System.out.println("3. Palindrome String ");
		   
		 String stre =str;
		 if(stre.equals(rev))
		 {
		 System.out.println("Given String is Palindrome");
		 }
		 else
		 {
		 System.out.println("Given String is not Palindrome");
		 }
		
	}
	
	
	@Test (priority=2)
	public void reversewordString() {
		System.out.println(" 3. Java program to reverse each and every word in the given String text");
		String str="Don't take revenge. let Karma do all the work";
		String rev="";
		
		 System.out.println(str);
		 
	     String[] words = str.split(" ");
	     
	     
	     String reversedStr = "";
	     
	      for(String word : words) {
	    	  
	            String reversedWord="";
	            
	             for(int i=word.length()-1;i>=0;i--) {
	                  
	                   reversedWord = reversedWord + word.charAt(i);
	                  
	            }
	            
	             reversedStr = reversedStr +reversedWord +" ";
	            
	     }
	     
	     System.out.println(reversedStr);
	     			
	}
	
	@Test (priority=-1)
	public void reverseOneWordString() {
		
		String str="Akash MAnoj Mahajan";
		String rev="";
		
		 System.out.println(str);
		 
	     String[] words = str.split(" ");
	     
	     
	     String reversedStr = "";
	     
	      for(String word : words) {
	    	  
	            String reversedWord="";
	            
	            if(word.equals("Mahajan")) {
	             for(int i=word.length()-1;i>=0;i--) {
	                  
	                   reversedWord = reversedWord + word.charAt(i);
	                  
	            }}
	            
	            // reversedStr = reversedStr +reversedWord +" ";
	            System.out.println(reversedWord); 
	     }
	     
	     
	     			
	}
	
	
	@Test (priority=3)
	public void reverseWordsString() {
		
		String str="Don't take revenge. let Karma do all the work";
		String rev="";
		System.out.println(str);	
	 String[] words = str.split(" ");
	 
	 for(int i=words.length-1; i>=0; i--)  {
		 
		 rev=rev+words[i]+" ";
		  }
	 System.out.println(rev);  
		
	}
	@Test (priority=100)
	public void SeperateNoAndString() {
		 System.out.println("Seperate NO and char ");
		  
			String place="Pu2323nem32323umbai";
			
			String numbers="";
			String chars="";
			
		for(int i=0; i<=place.length()-1; i++)  {
			
			if (Character.isDigit(place.charAt(i))) {
				
				
				numbers=numbers+(place.charAt(i));
				
			}
			else {
				chars=chars+place.charAt(i);
			}
		  }
		
			System.out.println(numbers);
		System.out.println(chars);
	
	}
	
	@Test (priority=50)
	public void removeSpace() {
		
		 System.out.println("Remove spaces from string ");
		 //used replaceAll method
		 
		 String inp="The Sun is the brightest star";
		 System.out.println("Given string is : "+inp);
		 //to remove all spaces
		 String newstr=inp.replaceAll("\\s", "");
		 //result without spaces
		 System.out.println("The String with out spaces is \n"+newstr);

		
	}
	@Test  (priority=14)
	public void removejunk() {
		System.out.println(".Remove junk and special cha. ");	
		
		String inp="The 1 Sun @#$%^*is*** the brightest  star";
		 System.out.println("Given string is : "+inp);
		
		 // used char operator ^
		 String newstr=inp.replaceAll("[^a-z A-Z 0-9]", "");
		 
		 System.out.println("The String with out junk is \n"+newstr);
		
		
	}
	
	@Test  (priority=80)
	public void CountWords() {
		System.out.println(".Remove junk and special cha. ");	
		
		String inp="The Sun is the brightest star";
		int count =1;
		for(int i=0; i<inp.length()-1;i++) {
			if((inp.charAt(i)==' ') && (inp.charAt(i+1)!=' ') ) {
				
				count++;
				
			}
			}
		 
		System.out.println(count);		
		
	}
	
	
	@Test   (priority=9)
	public void convertString() {
		
		
		  System.out.println("ava program to convert an integer to String ");
	    
		    int x = 555;
            
            String s = Integer.toString(x);  // integer class used
            
            System.out.println(s.length());
            System.out.println(" *****************************************************");		   
      
            System.out.println("ava program to convert an   String to integer ");
            
            String s1 = "9";
            
            int num1 = Integer.parseInt(s1);
            
            System.out.println(num1 );
            
            System.out.println(" *****************************************************");		        
            

	    }
		    

	@Test  (priority=11)
	public void findVowel() {	
//				  System.out.println("find vowel or not ");
//				   
//					
//			       Scanner scanner = new Scanner(System.in);
//		           
//		           System.out.println("Enter any character:");
//		           
//		            char c = scanner.next().charAt(0);  // if user write sting then user take 1st charactor of sting
//		            
//		            boolean isVowel = false;
//		           
//		            switch(c) {
//		         //   take lower and upper class as a case
//		            
//		                   case 'a' :
//		                   case 'e' :
//		                   case 'i' :
//		                   case 'o' :
//		                   case 'u' :
//		                  
//		                   case 'A' :
//		                   case 'E' :
//		                   case 'I' :
//		                   case 'O' :
//		                   case 'U' : isVowel = true;         
//		           
//		           }
//		           
//		            if(isVowel ==true) {
//		                  System.out.println(c+" is a vowel");
//		           } else {
//		                  System.out.println(c+" is not a vowel");
//		           }
//		           
//		           scanner.close();
				
	}

}
