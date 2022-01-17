package arrayprogram;

public class basic {
	
	
	   public static void main(String[] args) {
           
		   
		 //  Java program to reverse a String
           String str = "Arun Motoori";

                    String reversedStr="";  
          
                 // convert string into string character
                    //so all the letters store in index and then call woth index
                    
            char[] ca = str.toCharArray(); 
            for(int i=ca.length-1;i>=0;i--) {
                  
               reversedStr = reversedStr+ca[i];
                  
           }

           System.out.println(reversedStr);
   
    }

}
